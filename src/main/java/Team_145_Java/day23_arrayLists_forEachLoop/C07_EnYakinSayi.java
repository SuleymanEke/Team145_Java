package Team_145_Java.day23_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C07_EnYakinSayi {
    public static void main(String[] args) {

        //0 ile 100 arasinda rastgele bir sayi olusturun.
        // Kullanicilardan herkesin bir sayi tahmin etmesini isteyin. Girilen sayilari bir liste olarak kaydedin.
        // Kullanicilar negatif bir sayi girdiginde
        // -olusturulan rastgele sayiyi
        // -yapilan tahminleri
        // - rastgele sayiya en yakin tahmini yazdirin.

        Random random = new Random();
        int tutulanSayi = random.nextInt(100);

        int tahmin = 0;

        List<Integer> tahminlerListesi = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (tahmin >= 0) {
            System.out.println("Lutfen 0-100 arasinda tahmininizi giriniz: \nBitirmek icin negatif bir sayi giriniz: ");
            tahmin = scanner.nextInt();
            if (tahmin >= 0) {
                tahminlerListesi.add(tahmin);
            }
        }

        //tahminler alindi. Simdi en yakin tahmini bulalim.
        int enYakinSayi = tahminlerListesi.get(0);
        int enAzFark = 100;
        int fark = 0;
        for (int each : tahminlerListesi) {
            fark = tutulanSayi > each ? tutulanSayi - each : each - tutulanSayi;
            if (fark < enAzFark) {
                enYakinSayi = each;
                enAzFark = fark;
            }
        }
        System.out.println("Tututlan Sayi: " + tutulanSayi);
        System.out.println("Tahminler: " + tahminlerListesi);
        System.out.println("En yakin tahmin: " + enYakinSayi);

    }
}
