package Team_145_Java.day21_multiDimentionalArrays_arrayLists;

import java.util.Arrays;

public class C05_AyniIndexdekiElementler {
    public static void main(String[] args) {

        //Verilen 2 katli bir array'de ayni index'e sahip elemanlari toplayip,
        // yeni olusturacagimiz tek katli bir array'e bu toplamlari atayin.

        int[][] arr = {{3, 4, 5, 7, 4}, {2, 3, 6, 7}};

        int ortakIndexSayisi = arr[0].length < arr[1].length ? arr[0].length : arr[1].length;

//        if (arr[0].length < arr[1].length) {
//            ortakIndexSayisi = arr[0].length;
//        } else {
//            ortakIndexSayisi = arr[1].length;
//        }

        int[] ortakIndexArr = new int[ortakIndexSayisi];
        System.out.println(Arrays.toString(ortakIndexArr));

        for (int i = 0; i < ortakIndexArr.length; i++) {
            ortakIndexArr[i] = arr[0][i] + arr[1][i];
        }
        System.out.println(Arrays.toString(ortakIndexArr));
    }
}
