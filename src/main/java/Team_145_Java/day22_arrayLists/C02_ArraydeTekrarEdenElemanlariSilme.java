package Team_145_Java.day22_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArraydeTekrarEdenElemanlariSilme {
    public static void main(String[] args) {

        //verilen int bir array'den tekrar eden sayilari silip array'i
        // her sayidan tek bir adet bulunacak hale getirin.
        int[] arr = {3, 6, 4, 2, 3, 4, 6, 1, 7, 3, 5, 6, 7, 2, 1, 9};
        List<Integer> tekrarsizList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!tekrarsizList.contains(arr[i])) {
                tekrarsizList.add(arr[i]);
            }
        }
        //verilen array'deki sayilarin tekrarsiz halini bulduk.
        //Ancak suanda array degil arrayList
        System.out.println("tekrarsizList:" + tekrarsizList);

        int[] tekrarsizArr = new int[tekrarsizList.size()];

        for (int i = 0; i < tekrarsizList.size(); i++) {
            tekrarsizArr[i] = tekrarsizList.get(i);
        }
        arr = tekrarsizArr;
        System.out.println("arr'nin son hali: " + Arrays.toString(tekrarsizArr));

    }
}
