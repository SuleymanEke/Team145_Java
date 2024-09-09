package Team_145_Java.day22_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayListMethodlari {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2, 5, 8, 0, 1, 9, 3));

        System.out.println(sayilar);

        //listedeki eleman sayisiniz yazdirin
        System.out.println("Listedeki eleman sayisi: " + sayilar.size());

        //listenin bos olup olmadigini yazdirin
        System.out.println(sayilar.isEmpty());

        List<String> isimler= new ArrayList<>();
        System.out.println(isimler.isEmpty());

        //bir elemanin listede olup olmadigini kontrol etmek icin
        System.out.println(sayilar.contains(2));
    }
}
