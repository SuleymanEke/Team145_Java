package Team_145_Java.day23_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_ForEachLoop {
    public static void main(String[] args) {

        //Verilen String bir array'deki her bir elemani kontrol edip,
        // -Kelimenin uzunlugu cift sayi ise ilk yarisini,
        // - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        // yeni bir listeye ekleyip yazdirin.

        String[] arr = {"Okul", "Ders", "Kolay", "Cocuk isi", "imkansiz"};

        List<String> yeniList = new ArrayList<>();

        for (String each : arr) {
            if (each.length() % 2 == 0) { //gelen kelimeni uzunlugu cift
                yeniList.add(each.substring(0, each.length() / 2));
            } else { //gelen kelimeni uzunlugu tek
                yeniList.add(each.substring(each.length() / 2));
            }
        }
        System.out.println(yeniList);
    }
}
