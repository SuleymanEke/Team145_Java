package Team_145_Java.day22_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C12_ArrayiListeCevirme {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma"));

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2, 4, 5, 6));
        System.out.println(sayilar); //[2, 4, 5, 6]

        sayilar.add(9);
        System.out.println(sayilar); //[2, 4, 5, 6, 9]

        sayilar.remove(0);
        System.out.println(sayilar); //[4, 5, 6, 9]

        Integer[] arr = {4, 7, 9, 0, 1};

        List<Integer> listArr = Arrays.asList(arr);
        System.out.println(listArr);

        /*
        Bir array'i asList() ile List'e cevirmenin 2 tane cok negatif yan etkisi vardir.
        1. array'den gecis yapildigi icin listenin size'ini etkileyen add ve remove gibi metodlari kullanamayiz.
        listArr.add(5);
        System.out.println(listArr); //UnsupportedOperationException
        listArr.remove(0);
        System.out.println(listArr); //UnsupportedOperationException

        2. kaynak array ve donusturdugumz liste ozdes olarak calisir.
        Yani birinde yapilan degisiklikler OTOMATIK olarak otekine de islenir.
         */

        System.out.println(Arrays.toString(arr)); //[4, 7, 9, 0, 1]
        System.out.println(listArr); //[4, 7, 9, 0, 1]

        arr[0] = 10;
        System.out.println(Arrays.toString(arr)); //[10, 7, 9, 0, 1]
        System.out.println(listArr); //[10, 7, 9, 0, 1]

        /*
        Bu cevirme islemini daha saglikli yapmak icin
        bos bir list olusturup, loop ile tum elemanlari listeye kopyalayabiliriz.
         */

        int[] arr3 = {3, 6, 7, 8, 4, 3, 3, 1, 2, 5, 7, 8, 9, 0, 9, 4, 5, 6, 7};

        List<Integer> arraydenList = new ArrayList<>();
        for (int i = 0; i < arr3.length; i++) {
            arraydenList.add(arr3[i]);
        }
        System.out.println("arraydenList: " + arraydenList); //[3, 6, 7, 8, 4, 3, 3, 1, 2, 5, 7, 8, 9, 0, 9, 4, 5, 6, 7]

        arraydenList.add(10);
        System.out.println(arraydenList); //[3, 6, 7, 8, 4, 3, 3, 1, 2, 5, 7, 8, 9, 0, 9, 4, 5, 6, 7]

        arraydenList.remove(0);
        System.out.println(arraydenList); //6, 7, 8, 4, 3, 3, 1, 2, 5, 7, 8, 9, 0, 9, 4, 5, 6, 7, 10]




    }

}
