package Team_145_Java.day23_arrayLists_forEachLoop;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        //Verilen int array'deki her elemanin karelerini alip,
        // karelerinin toplamini yazdiran bir metod olusturun.

        int[] arr = {3, 7, 1, 0, 5};
        elemanlarinKareleriniTopla(arr);

        int[] arr2 = {6, 7, 2, 3, 5, 8, 9, 5};
        elemanlarinKareleriniTopla(arr2);

        int[] arr3 = {2,3,4,5};
        elemanlarinKareleriniTopla(arr3);

    }

    public static void elemanlarinKareleriniTopla(int[] arr) {
        int toplam = 0;
        for (int each : arr) {
            toplam += each * each;
        }
        System.out.println("Verilen array'deki elemanlarin karelerinin toplami: " + toplam);

    }
}


