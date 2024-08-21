package Team_145_Java.day13_forLoop;

import java.util.Scanner;

public class C08_RakamlarToplami2 {
    public static void main(String[] args) {

        //Kullanicidan pozitif bir tam sayi alip, rakamlar toplamini yazdirin.
        //input : 1453 ==> output => Girdiginiz 1453 sayisi icin rakamlar toplami : 13

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakamlar toplamini bulmak icin bir pozitif tamsayi giriniz: ");
        int girilenSayi = scanner.nextInt();

        int basamakSayisi = (girilenSayi + "").length();
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int dummyNumber = girilenSayi;

        for (int i = 1; i <= basamakSayisi; i++) {
            birlerBasamagi = dummyNumber % 10;
            rakamlarToplami += birlerBasamagi;
            dummyNumber /= 10;
        }
        System.out.println("Girdiginiz " + girilenSayi + " sayisi icin rakamlar toplami " + rakamlarToplami);


    }
}
