package Team_145_Java.day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C02_SayiToplama {
    public static void main(String[] args) {

        //kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        //kullanicinin girdigi pozitif sayilarin toplami 500 veya daha fazla oldugunda
        //toplam kac adet pozitif tam sayi girdigini
        //ve bunlarin toplaminin kac oldugunu yazdirin
        //kullanici 0 veya negatif bir sayi gorerse "Sayi pozitif olmalidir" yazdirin
        //ve girilen uygun olmayan sayiyi sayi adedine ve toplamina ekleyin

        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        int sayac = 0;

        while (toplam < 500) {
            System.out.println("Lutfen toplanmak uzere pozitif bir sayi giriniz: ");
            sayi = scanner.nextInt();

            if (sayi > 0) {
                toplam += sayi;
                sayac++;
            } else {
                System.out.println("Sayi pozitif olmalidir");
            }
        }
        System.out.println("Girdiginiz " + sayac + " adet pozitif tamsayilarin toplami: " + toplam);
    }
}
