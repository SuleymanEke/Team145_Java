package Team_145_Java.day15_methodOlusturmaVeKullanma;

public class C02_MethodOlusturma {
    public static void main(String[] args) {

        //Verilen pozitif vir tamsayinin faktoryel degerini yazdiran bir method olusturun

        faktoryelDegeriYazdir(5);
        faktoryelDegeriYazdir(3);

    }

    public static void faktoryelDegeriYazdir(int sayi) {
        int faktoryelSonucu = 1;
        for (int i = sayi; i >= 1; i--) {
            faktoryelSonucu *= i;
        }
        System.out.println(sayi + "! = " + faktoryelSonucu + " ");

    }
}
