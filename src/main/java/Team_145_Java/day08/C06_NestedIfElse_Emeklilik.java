package Team_145_Java.day08;

import java.util.Scanner;

public class C06_NestedIfElse_Emeklilik {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz: ");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz:");
        int yas = scanner.nextInt();

        if (cinsiyet == 'K') { //kadinlari secer
            if (yas < 15 || yas > 80) {
                System.out.println("Bu yas degerleri icin emeklilik hesaplanamaz. ");
            } else if (yas >= 60) {
                System.out.println("Kadin 60 yasindan itibaren emekli olabilir. ");
            } else {
                System.out.println("Emeklilik yasi 60, daha " + (60 - yas) + "yil calismali. ");
            }

        } else if (cinsiyet == 'E') { // erkekleri secer
            if (yas < 15 || yas > 80) {
                System.out.println("Bu yas degerleri icin emeklilik hesaplanamaz. ");
            } else if (yas >= 65) {
                System.out.println("Kadin 65 yasindan itibaren emekli olabilir. ");
            } else {
                System.out.println("Emeklilik yasi 60, daha " + (65 - yas) + " yil calismali. ");
            }

        } else { // cisinyet olarak K veya E disinda deger girenler
            System.out.println("Cinsiyet E veya K olarak girilmelidir. ");
        }

    }
}
