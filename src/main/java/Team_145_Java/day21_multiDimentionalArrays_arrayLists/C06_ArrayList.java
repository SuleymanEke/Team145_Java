package Team_145_Java.day21_multiDimentionalArrays_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ArrayList {
    public static void main(String[] args) {

        //1- liste icine yazacagimiz elemanlarin data turu primitive olamaz.
        //2- List olustururken asagidaki yazimlardan 3'u de kullanilabilir.

        List<Integer> sayilar = new ArrayList<>();
        ArrayList<String> isimler = new ArrayList<>();
        ArrayList<Boolean> sonuclar = new ArrayList<Boolean>();

        //bir arrayLis ilk olusturuldugunda bos olur ve elemanlar teker teker eklenir.
        //teker teker eklenen elemanlar ekleme sirasina gore list'e konulur.
        System.out.println(sayilar);

        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        System.out.println(sayilar);

        sayilar.add(1, 0);
        System.out.println(sayilar);

        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(11, 12, 13));
        sayilar.addAll(list2); //sayilar'in sonuna lis2'yi ekler.

        System.out.println(sayilar);
        System.out.println(list2);

        //sayilar'in basina list2'yi ekleyelim.
        sayilar.addAll(0, list2);
        System.out.println(sayilar);





    }
}
