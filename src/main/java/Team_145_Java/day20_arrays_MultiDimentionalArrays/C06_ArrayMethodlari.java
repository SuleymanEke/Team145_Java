package Team_145_Java.day20_arrays_MultiDimentionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C06_ArrayMethodlari {
    public static void main(String[] args) {
        /*
        String'de atama olmazsa degisiklikler kalici olmuyordu
        ama arrays ve arrayList'de atama olmasa da metodla yapilan degisiklikler kalici olur.
         */

        int[] arr = {2, 9, 5, 0, 1, -4};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //01.34e geldim
        int[] arr2 = {-5, 9, 0, -3, 7, 6, 6, 8, -3};

        //sadece ilk 6 elemani siralayin, digerleri ayni kalsin
        Arrays.sort(arr2, 0, 6);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {3, 6, 8};
        int[] arr4 = {6, 3, 8};
        int[] arr5 = {3, 6, 8};

        System.out.println(Arrays.equals(arr3, arr4));
        System.out.println(Arrays.equals(arr3, arr5));

        Arrays.sort(arr4);
        System.out.println(Arrays.equals(arr3, arr4));

    }
}
