package Team_145_Java.day21_multiDimentionalArrays_arrayLists;

import java.util.Arrays;

public class C01_CokKatliArrayler {
    public static void main(String[] args) {

        int[][] ikiKatliArr = {{2, 3, 4}, {4, 8}, {7}, {1, 5, 6, 9}};

        /*
        Cok katli array'lerde bir sey yazdirmak istedigimizde yazdiracagimiz seyin bir array mi
        yoksa direkt yazdirabilecegimiz bir eleman mi oldugunu anlamaliyiz
         */

        System.out.println("ikiKatliArr'in 0. index'i: " + Arrays.toString(ikiKatliArr[0]));
        System.out.println("ikiKatliArr'in 1. index'i: " + Arrays.toString(ikiKatliArr[1]));
        System.out.println("ikiKatliArr'in 2. index'i: " + Arrays.toString(ikiKatliArr[2]));
        System.out.println("ikiKatliArr'in 3. index'i: " + Arrays.toString(ikiKatliArr[3]));

        System.out.println(ikiKatliArr[0][1]);
        System.out.println(ikiKatliArr[2][0]);

        //ikiKatliArr'in tamamini bir array olarak yazdirin.
        System.out.println("Ana Array: " + Arrays.deepToString(ikiKatliArr));

        int[] arr1 = {3, 6, 7};
        int[] arr2 = {3, 5, 6, 8};
        int[] arr3 = {7, 8, 0, 9};

        int[][] cokKatliArr = {arr1, arr2, arr3};

        System.out.println(Arrays.deepToString(cokKatliArr));
    }
}
