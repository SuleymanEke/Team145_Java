package Team_145_Java.day22_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_ListedenElemanSilme {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3, 5, 6, 1, 2, 9));
        System.out.println(sayilar);

        //remove() metodu iki turlu calisir.
        //remove(index)
        //remove(istenen eleman)
        sayilar.remove(3);
        System.out.println(sayilar);

        //Biz illa da eleman olan 9'u silmek istersek

        Integer silinecekSayi = 9;
        sayilar.remove(silinecekSayi);
        System.out.println(sayilar);


    }
}
