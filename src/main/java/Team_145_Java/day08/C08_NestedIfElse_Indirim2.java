package Team_145_Java.day08;

import java.util.Scanner;

public class C08_NestedIfElse_Indirim2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Lutfen urun adedi giriniz: ");
        int urunAdedi = scanner.nextInt();

        System.out.println("Urunun indirimsiz fiyatini giriniz: ");
        double urunFiyati = scanner.nextDouble();

        double indirimsizToplamFiyat = urunFiyati * urunAdedi;

        System.out.println("Musteri kartiniz var mi ? E: Evet - H: Hayir");
        char kartVarMi = scanner.next().toUpperCase().charAt(0);

        //ana degisken urun sayisi olsun

        if (urunAdedi > 10) { // 10 adetten fazla alanlar buraya gelir
            if (kartVarMi == 'E') {
                System.out.println("%20 indirimli fiyat: " + indirimsizToplamFiyat * 80 / 100);
            } else if (kartVarMi == 'H') {
                System.out.println("%15 indirimli fiyat: " + indirimsizToplamFiyat * 85 / 100);
            } else {
            }
        } else { // 10 adetten az alanlar buaraya gelir
            if (kartVarMi == 'E') {
                System.out.println("%15 indirimli fiyat: " + indirimsizToplamFiyat * 80 / 100);
            } else if (kartVarMi == 'H') {
                System.out.println("%10 indirimli fiyat: " + indirimsizToplamFiyat * 85 / 100);
            } else {
            }
        }
    }
}
