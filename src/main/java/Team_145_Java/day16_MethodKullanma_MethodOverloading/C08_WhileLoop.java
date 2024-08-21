package Team_145_Java.day16_MethodKullanma_MethodOverloading;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {

        //kullaniciya istedigi kadar pozitif sayi girmesini soyleyin.
        //girilen sayilar pozitif ise sayi toplama ekleyin.
        //girilen sayi negatif ise uyari verin ve sayiyi isleme almayin.
        //girilen sayi 0 oldugunda islemi bitirin
        //ve kaca tane pozitif sayi girlidigini ve toplamlarini ka oldugunu yazdirin.

        Scanner scanner = new Scanner(System.in);

        int sayi = 1;
        int toplam = 0;
        int sayac = 0;

        while (sayi != 0) {
            //kullanicidan sayi isteyelim
            System.out.println("Lutfen pozitif bir tam sayi giriniz ve bitirmek icin 0'a basiniz: ");
            sayi = scanner.nextInt();

            if (sayi > 0) {
                toplam += sayi;
                sayac++;
            } else if (sayi < 0) {
                System.out.println("Lutfen pozitif bir tam sayi giriniz!");
            }
        }
        System.out.println("Girdiginiz " + sayac + " adet pozitif sayilarin toplami: " + toplam);
    }
}
