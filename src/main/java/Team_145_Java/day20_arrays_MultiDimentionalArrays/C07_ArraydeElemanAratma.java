package Team_145_Java.day20_arrays_MultiDimentionalArrays;

import java.util.Arrays;

public class C07_ArraydeElemanAratma {
    public static void main(String[] args) {

        int[] arr = {-2, 5, 3, 9, 1, 8, 15, -4};

        //array'de bir elemanin var olup olmadigini kontrol etmek icin
        System.out.println("-2: " + Arrays.binarySearch(arr, -2));
        System.out.println("5: " + Arrays.binarySearch(arr, 5));
        System.out.println("3: " + Arrays.binarySearch(arr, 3));
        System.out.println("9: " + Arrays.binarySearch(arr, 9));
        System.out.println("1: " + Arrays.binarySearch(arr, 1));
        System.out.println("8: " + Arrays.binarySearch(arr, 8));
        System.out.println("15: " + Arrays.binarySearch(arr, 15));
        System.out.println("-4: " + Arrays.binarySearch(arr, -4));
        System.out.println("4: " + Arrays.binarySearch(arr, 4));
        System.out.println("20: " + Arrays.binarySearch(arr, 20));
        System.out.println("-20: " + Arrays.binarySearch(arr, -20));
        System.out.println("0: " + Arrays.binarySearch(arr, 0));

        //Array'de saglikli bir arama yapilabilmesi icin once sort() calisitirilmalidir
        //siralama yapilmamis bir array'de binarySearch() sonucu ONGURULEMEZ
        //dogru islem yapip elemanin oldugu index'i verebilir
        // ama yanlislik yapip var olan elemani yok olarak da raporlayabilir.

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[-4, -2, 1, 3, 5, 8, 9, 15]

        System.out.println("-2'in index sirasi: " + Arrays.binarySearch(arr, -2));
        System.out.println("5'in index sirasi: " + Arrays.binarySearch(arr, 5));
        System.out.println("3un index sirasi: " + Arrays.binarySearch(arr, 3));
        System.out.println("9'un index sirasi: " + Arrays.binarySearch(arr, 9));
        System.out.println("1'in index sirasi: " + Arrays.binarySearch(arr, 1));
        System.out.println("8'in index sirasi: " + Arrays.binarySearch(arr, 8));
        System.out.println("15'in index sirasi: " + Arrays.binarySearch(arr, 15));
        System.out.println("-4'un index sirasi: " + Arrays.binarySearch(arr, -4));
        System.out.println("4'un index sirasi: " + Arrays.binarySearch(arr, 4));
        System.out.println("20'in index sirasi: " + Arrays.binarySearch(arr, 20));
        System.out.println("-20'in index sirasi: " + Arrays.binarySearch(arr, -20));
        System.out.println("0'in index sirasi: " + Arrays.binarySearch(arr, 0));

        /*
         binarySearch()
        1 - var olan elemanlar icin index doner.
        2 - olmayan elemanlarin olmadini anlamamiz icin basina - koyar.
        3 - olmayan elemanlar icin index degil de sira numarasi - olarak verilir
         */




    }
}
