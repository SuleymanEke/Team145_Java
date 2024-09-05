package Team_145_Java.day20_arrays_MultiDimentionalArrays;

import java.util.Arrays;

public class C01_ArraydekiElemanlariArtirma {
    public static void main(String[] args) {
        //verilen bir int array'in tum elemanlarini istenen bir deger kadar
        // artirip bize donduren bir method olsuturun.
        //eski array'in yeni haliyle kaydedin.

        int[] arr = {3, 7, 9, 1, 8, 4};
        int artirmaSayisi = 2;
        arr = arrayinElemanlariniArtir(arr, artirmaSayisi);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayinElemanlariniArtir(int[] arr, int artirmaMiktari) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += artirmaMiktari;
        }
        return arr;

    }

}
