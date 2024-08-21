package Team_145_Java.day13_forLoop;

import java.util.Scanner;

public class C06_FaktoryelYazdirma {
    public static void main(String[] args) {

        //Kullanicidan 14'ten kucuk bir sayi alip,
        //bu sayinin faktoryel degerini hesaplayin.
        //Konsolda faktoryel hesabinin yapilisini da yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktoryel hesaplamak icin bir pozitif tamsayi giriniz: ");
        int sayi = scanner.nextInt();
        int faktoryelDegeri = 1;

        System.out.print(sayi + "! = ");

        for (int i = sayi; i >= 1; i--) {
            faktoryelDegeri *= i;
            if (i != 1) {
                System.out.print(i + " * ");
            }
        }
        System.out.println("1 = " + faktoryelDegeri);


    }
}
