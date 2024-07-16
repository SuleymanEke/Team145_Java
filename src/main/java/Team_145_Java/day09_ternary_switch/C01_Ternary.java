package Team_145_Java.day09_ternary_switch;

public class C01_Ternary {
    public static void main(String[] args) {
        //Basit bir if-else yapabilecek kodlari tek satirda
        //yapabilmek icin ternary tercih edilebilir.

        int sayi = 5;

        //Ornegin verilen sayinin tek veya cift oldugunu YAzdirmak icin

        System.out.println(sayi % 2 == 0 ? "Cift Sayi " : "Tek Sayi ");

        //Verilen sayi negatif ise degerini 10 aritirin
        //negatif degilse degerini 3 azaltin

        sayi = sayi < 0 ? sayi + 10 : sayi - 3;
        System.out.println("Sikan Sonuc: " + sayi);

        //Ternary operatoru ya sout icinde kullanilmali
        //yada mutlaka atama yapilmalidir.

        sayi = 12;

        //Sayi cift ise cift sayi yazdirin
        //cift sayi degilse degerini 5 artirin

        System.out.println(sayi % 2 == 0 ? "Cift Sayi" : sayi + 5);
        System.out.println(sayi);

        //Ternary spesifik bir sey. Sadece If-Else'lerde kullaniyoruz.

        if (sayi % 2 == 0) {
            System.out.println("Cift Sayi");
        } else {
            sayi += 5;
            System.out.println(sayi);
        }


    }
}
