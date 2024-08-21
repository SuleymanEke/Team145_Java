package Team_145_Java.day13_forLoop;

import java.util.Scanner;

public class C07_RakamlarToplami {
    public static void main(String[] args) {

        //Kullanicidan pozitif bir tam sayi alip, rakamlar toplamini yazdirin.
        //input : 1453 ==> output => 1+4+5+3 = 13

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakamlar toplamini bulmak icin bir pozitif tamsayi giriniz: ");
        int girilenSayi = scanner.nextInt();

        int basamakSayisi = (girilenSayi + "").length();
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        for (int i = 1; i <= basamakSayisi; i++) {
            birlerBasamagi = girilenSayi % 10;
            rakamlarToplami += birlerBasamagi;
            girilenSayi /= 10;
        }
        System.out.println("Rakamlar Toplami: " + rakamlarToplami);


    }
}
