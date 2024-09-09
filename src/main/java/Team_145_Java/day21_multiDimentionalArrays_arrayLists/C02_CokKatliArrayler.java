package Team_145_Java.day21_multiDimentionalArrays_arrayLists;

public class C02_CokKatliArrayler {
    public static void main(String[] args) {
        /*
        Tek katli bir array'in tum elemanlarini gozden gecirmek istersek bir for loop olustururuz
        ve arr[i] sirasiyla butun elemanlari gize getirir.

        Iki katli bir array oldugunda kat kadar ic ice loop olusturmaliyiz. ikiKatliArr[i][j] bize tum
        elemanlari sirasiyla getirir.
        EGER butun elemanlari degil belirli elemanlari istiyorsa bu durumda once bulmacayi cozmemiz lazim.
         */

        int[] arr = {3, 6, 7, 8, 9, 1};

        //arr'in tum elemanlarin toplamini yazdirin

        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        System.out.println("arr'in tum elemanlarin toplami: " + toplam);


        int[][] ikiKatliArr = {{3, 6, 7}, {2, 8, 1}, {4, 7}, {1}};
        toplam = 0;
        for (int i = 0; i < ikiKatliArr.length; i++) { //outer array
            for (int j = 0; j < ikiKatliArr[i].length; j++) { //inner array
                toplam += ikiKatliArr[i][j];
            }
        }
        System.out.println("ikiKatliArr'in tum elemanlarin toplami: " + toplam);


    }
}
//01:30:40'a geldim

