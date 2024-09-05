package Team_145_Java.day19_arrays;

public class C02_ArrayOlusturma {
    public static void main(String[] args) {
        int sayi = 4;
        String str = "Java gun gectikce guzellesir";
        //bir array olustururken 2 sey mutlaka belirtilmelidir.
        //1 - array'in icine konulacak degerlerin data turleri.
        // arr1'in data turu array, int array icine konulacak degerlerin data turudur.
        //2 - bu array'in icine kac elaman konulacagi

        int[] arr1 = {1, 2, 3, 4, 5, 7};
        String[] arr2 = {"Tugba", "Sabri", "Suleyman", "Ali", "Volkan", "Tolga"};

        //Bir array iki sekilde olusturulabilir.
        //1 - 12. ve 13. satirlarda oldugu gibi elemanlari direk atayabiliriz.
        //bu yontemle array olusturuldugunda array'in eleman sayisi atadigimiz eleman sayisi kadardir.
        //2 - arra'in icine konulacak elemanlarin data turunu ve eleman sayisini soyleyerek default
        // degerlere sahip bir array olusturabiliriz.

        int[] arr3 = new int[4]; // deger atamadiysak degeri [0,0,0,0]
        String[] arr4 = new String[5]; //[null, null, null, null, null]
        boolean[] arr5 = new boolean[3]; //[false, false, false]



    }

}
