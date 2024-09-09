package Team_145_Java.day23_arrayLists_forEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        /*
        For-each loop array veya arrayList gibi birden fazla eleman barindiran yapilardaki
        TUM ELEMANLARI elden gecirmek istedigimizde kullanilir.

        For-each loop index kullanmaz. Verilen coklu eleman barindiran yapidaki
        TUM ELEMANLARI siraya bagli olmaksizin beize gitirir.
         */

        int[] arr = {3, 7, 1, 0, 5};
        int toplam = 0;

        for (int w : arr) {
            toplam += w;
        }
        System.out.println("Toplam: " + toplam); //Toplam: 16

    }
}
