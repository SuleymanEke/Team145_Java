package Team_145_Java.day16_MethodKullanma_MethodOverloading;

import Team_145_Java.day15_methodOlusturmaVeKullanma.C02_MethodOlusturma;

import java.util.Scanner;

public class C02_FaktoryelHesaplama {
    public static void main(String[] args) {

        //Verilen pozitif tamsayinin faktoryel degerini  bize donduren bir method olusturun

        C02_MethodOlusturma.faktoryelDegeriYazdir(6);

        //Kullanicidan pozitif tamsayi alip, sayi ile sayinin faktoryel degerini toplayip sayi variable'ina atayin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz: ");
        int sayi = scanner.nextInt();

        sayi = sayi + faktoryelDegeriDondur(sayi);

    }

    public static int faktoryelDegeriDondur(int sayi) {
        int faktoryelDegeri = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoryelDegeri *= i;
        }
        return faktoryelDegeri;
    }
}
