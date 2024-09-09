package Team_145_Java.day21_multiDimentionalArrays_arrayLists;

public class C03_CokKatliArraydeCiftSayilariToplama {
    public static void main(String[] args) {

        //Verilen 2 katli bir array'de bulunan cift sayilari toplayip, sonucunu yazdiran bir method olusturun.

        int[][] arr1 = {{3, 6, 7}, {2, 8, 1}, {4, 7}, {1}};
        ikiKatliArraydekiCiftSayilariTopla(arr1);

        int[][] arr2 = {{1, 3, 6, 7}, {5, 6, 2, 8, 1}, {4, 7}, {1}, {4, 6, 8}};
        ikiKatliArraydekiCiftSayilariTopla(arr2);

    }

    public static void ikiKatliArraydekiCiftSayilariTopla(int[][] arr) {
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    toplam += arr[i][j];
                }
            }
        }
        System.out.println("Verilen arraydeki cift sayilarin toplami: " + toplam);
    }
}
