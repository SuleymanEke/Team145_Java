package Team_145_Java.day08;

import java.util.Scanner;

public class C07_NestedIfElse_Indirim1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Lutfen urun adedi giriniz: ");
        int urunAdedi = scanner.nextInt();

        System.out.println("Urunun indirimsiz fiyatini giriniz: ");
        double urunFiyati = scanner.nextDouble();

        double indirimsizToplamFiyat = urunFiyati * urunAdedi;

        System.out.println("Musteri kartiniz var mi ? E: Evet - H: Hayir");
        char kartVarMili = scanner.next().toUpperCase().charAt(0);

        //ana degisken kart var mi olsun

        if (kartVarMili == 'E') { // Sadece karti olanlar buraya gelir
            if (urunAdedi > 10) {
                System.out.println("%20 indirimli fiyat: " + indirimsizToplamFiyat * 80 / 100);
            } else {
                System.out.println("%15 indirimli fiyat: " + indirimsizToplamFiyat * 85 / 100);
            }
        } else if (kartVarMili == 'H') { // Sadece karti olmayanlar buraya gelir
            if (urunAdedi > 10) {
                System.out.println("%15 indirimli fiyat: " + indirimsizToplamFiyat * 85 / 100);
            } else {
                System.out.println("%10 indirimli fiyat: " + indirimsizToplamFiyat * 90 / 100);
            }
        } else { // kart var mi disinda girenler
        }

    }
}
