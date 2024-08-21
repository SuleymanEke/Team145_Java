package Team_145_Java.day12_stringManipulations;

import java.util.Scanner;

public class C08_sifreKontrolu {
    public static void main(String[] args) {

        //Kullanicidan bir seifre isteyip,
        //asagidaki sartlari kontrol edin ve kullaniciya duzeltmesi gereken tum eksiklikleri soyleyin,
        //eger tum sartlari saglarsa "sifre basariyla kaydedildi" diye yazdirin,
        // - ilk harf kucuk olmali
        //- son karakter rakam olmali
        //- sifre bosluk icermemeli
        //- uzunlugu en az 10 karakter olmali
        //eger bir sart saglanamazsa "lutfen yeni bir sifre giriniz" diye yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz: ");
        String sifre = scanner.nextLine();

        //Sartlar birbirinden bagimsiz oldugunda
        //ve Tum Hatalari yazdirmamiz istendiginden
        // bagimsiz if cumleleri kullanacagiz

        //Ancak bagimsiz if cumleleri kullandigimizda
        //en sonunda sifrenin basarili veya hatali oldugunu anlamak icin
        //FLAG veya SAYAC kullanmaliyiz
        //biz sayac kullanmayi tercih ettik

        int hataSayaci = 0;

        //ilk harf kucuk harf olmali
        if (!Character.isLowerCase(sifre.charAt(0))) {
            System.out.println("Ilk harf kucuk olmali ");
            hataSayaci++;
        }

        //son karakter rakam olmali

        if (!Character.isDigit(sifre.charAt(sifre.length() - 1))) {
            System.out.println("Son karakter rakam olmali ");
        }

        //sifre bosluk icermemeli

        if (sifre.contains(" ")) {
            System.out.println("Sifre bosluk icermemeli");
            hataSayaci++;
        }

        //uzunlugu en az 10 karakter olmali
        if (sifre.length() < 10) {
            System.out.println("Uzunlugu en az 10 karakter olmali");
            hataSayaci++;
        }

        //eger tum sartlari saglarsa "sifre basariyla kaydedildi" diye yazdirin

        if (hataSayaci == 0) {
            System.out.println("Sifre basariyla kaydedildi");
        } else {
            System.out.println("Lutfen yeni bir sifre giriniz");
        }


    }
}
