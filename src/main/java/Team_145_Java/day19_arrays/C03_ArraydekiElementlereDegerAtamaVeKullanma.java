package Team_145_Java.day19_arrays;

import java.util.Arrays;

public class C03_ArraydekiElementlereDegerAtamaVeKullanma {
    public static void main(String[] args) {
        int[] arr = new int[5];//[0,0,0,0,0]
        System.out.println(arr);//[I@b4c966a
        //bir array'i direk olarak yazdiramayiz.
        //eger yazdirmak istersek Arrays.toString() methodunu kullaniriz.

        System.out.println("Array yazdirma: " + Arrays.toString(arr));//[0, 0, 0, 0, 0]

        //bir array olusturulup uzunlugu deklare edildikten sonra o array'deki eleman sayisi DEGISTIRILEMEZ.
        arr = new int[8]; //[0,0,0,0,0,0,0,0]

        //bir array'deki elemanlara nasil deger atayabilir ve kullanabiliriz?
        //2. index'deki elemani 5 yapin
        arr[2] = 5;
        arr[4] = 7;
        System.out.println(Arrays.toString(arr));//[0, 0, 5, 0, 7, 0, 0, 0]

        //array'in 3. index'ndeki elemani yazdirin
        System.out.println(arr[3]);//0

        //arrayin 1. ve 2. index'indeki elemanlarin toplamini yazdirin
        System.out.println(arr[1] + arr[2]);//5

        //index 6'ya 7. eleman olarak 10'u atayin
        arr[6] = 10;
        System.out.println(arr[6]);

        //3. index'deki elementi silip array'i 5 elemanli hale getirin
        //Array'e yeni bir eleman eklenemez veya var olan bir eleman silinemez.
        //length'i degismez.
        System.out.println(Arrays.toString(arr));

        //array'e yeni 5 uzunlugunda bir deger atamasi yaparsak eksi array'in icindeki elemanlar
        // yok olur.
        arr = new int[5];
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0]



    }
}
