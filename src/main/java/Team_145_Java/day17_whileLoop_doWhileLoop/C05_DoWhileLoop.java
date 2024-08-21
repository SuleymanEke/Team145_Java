package Team_145_Java.day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C05_DoWhileLoop {
    public static void main(String[] args) {

        //kullanicidan toplanmak uzere sayilar isteyin
        //kullanici 0'a bastiginda islemi bitirin
        //ve girilen sayilar icerisinde en kucuk olan sayiyi yazdirin

        Scanner scanner = new Scanner(System.in);
        int sayi = 25;
        /*
        whileloop'un en zayif tarafi
        kullanicidan alacagimiz deger icin baslangicta bizim bir deger atamamizdir.

        Eger loop'u kullanicidan alacagimiz bir variable'a gore kurguladigimizda bizim
        ilk deger atamasi yapmamiz gerekiyorsa loop'un calsimasini saglayacak bir deger ATAMALIYIZ.
         */
        int enKucukSayi = Integer.MAX_VALUE;

        while (sayi != 0) {
            System.out.println("Lutfen bir tamsayi giriniz: ");
            sayi = scanner.nextInt();

            if (sayi < enKucukSayi && sayi != 0) {
                if (sayi != 0) {
                    enKucukSayi = sayi;
                }
            }
            System.out.println("Girilen en kucuk sayi: " + enKucukSayi);
        }


    }
}
