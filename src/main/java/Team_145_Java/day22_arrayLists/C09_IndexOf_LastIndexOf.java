package Team_145_Java.day22_arrayLists;

import java.util.*;

public class C09_IndexOf_LastIndexOf {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2, 3, 5, 3, 5, 7, 9, 5, 3, 5, 2));
        System.out.println(sayilar.indexOf(5));
        System.out.println(sayilar.lastIndexOf(5));
        System.out.println(sayilar.indexOf(11)); //-1

        List<String> isimlerListesi = new ArrayList<>(Arrays.asList("Eyup", "Yahya", "Esra", "Seher"));
        System.out.println(isimlerListesi); //[Eyup, Yahya, Esra, Seher]

        Collections.sort(isimlerListesi);
        System.out.println(isimlerListesi); //[Esra, Eyup, Seher, Yahya]
    }
}

