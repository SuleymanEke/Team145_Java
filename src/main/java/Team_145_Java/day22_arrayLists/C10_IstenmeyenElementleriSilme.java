package Team_145_Java.day22_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C10_IstenmeyenElementleriSilme {
    public static void main(String[] args) {

        /*
        String metod ile yapilan degisiklikler atama olmasa da KALICI olur.
        ANCAK aray ve arrayList'de metod ile yapilan degisiklikler atama olmasa da KALICI olur.
         */

        //Verilen String bir listede istenmeyen harf iceren elemanlari silip
        // kalan kismini list olarak bize donduren bir metod olusturun.

        List<String> isimler = new ArrayList<>(Arrays.asList("Ahmet", "Ali", "Veli", "Ayse", "Fatma"));
        System.out.println(istenmeyenElemanalariSil(isimler, "e"));
        System.out.println(istenmeyenElemanalariSil(isimler, "a"));
        System.out.println(istenmeyenElemanalariSil(isimler, "A"));

    }

    public static List<String> istenmeyenElemanalariSil(List<String> ilkList, String istenmeyenHarf) {

        for (int i = 0; i < ilkList.size(); i++) {
            if (ilkList.get(i).contains(istenmeyenHarf)) {
                ilkList.remove(ilkList.get(i));
                i--;
            }
        }
        return ilkList;
    }
}
