package Team_145_Java.day20_arrays_MultiDimentionalArrays;

import java.util.Arrays;

public class C05_ArrayeElemanEkleme {
    public static void main(String[] args) {

        //Verilen bir array'e istenen bir elemani ekleyip bize donduren bir metod yazdirin,
        // eski array'e yeni deger atayin.

        int[] arr = {3, 4, 7, 1};
        int eklenecekEleman = 8;

        // arr[4] = 8;
        //4 elemanli olarak olusturulan bir array'e 5. elemani direk ekleyemezsiniz.
        // arr=new int[5]; bu islemi yaparsak eski degerler silinmis olur.
        arr = arrayeBirElemanEkle(arr, eklenecekEleman);
        arr = arrayeBirElemanEkle(arr, -3);
        arr = arrayeBirElemanEkle(arr, -5);
        arr = arrayeBirElemanEkle(arr, 8);
        System.out.println("arr'nin son hali: " + Arrays.toString(arr));

    }

    public static int[] arrayeBirElemanEkle(int[] arr, int eklenecekEleman) {
        //once 1 fazla elemana sahip yeni bir array olusturalim.
        int[] yeniArr = new int[arr.length + 1];

        //eski array'de var olan tum elemanlari yeni array'e kopyalayalim.
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i] = arr[i];
        }
        System.out.println(Arrays.toString(yeniArr));

        //sonuncu endex'e eklenecekElemen'i atayalim.
        yeniArr[yeniArr.length - 1] = eklenecekEleman;

        //eski arr'ye yeniArr atayalim.
        arr = yeniArr;
        System.out.println(Arrays.toString(arr));
        return arr;

    }
}
