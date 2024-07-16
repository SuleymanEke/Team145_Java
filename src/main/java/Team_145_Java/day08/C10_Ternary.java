package Team_145_Java.day08;

import java.util.Scanner;

public class C10_Ternary {
    public static void main(String[] args) {
        //Kullanicidan bir tam sayi isteyin
        //sayi 100'den buyukse sayiyi 10 azaltin
        //sayi 100'den buyuk degilse sayiya 20 ekleyin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz: ");
        int sayi = scanner.nextInt();

        //If Else ile
        if (sayi > 100) { //sayi = sayi-10 veya daha sik
            System.out.println("100'den buyukse: " + (sayi -= 10));
        } else {
            System.out.println("100'den kucukse: " + (sayi += 20));
        }

        //Ternary ile

        sayi = sayi > 100 ? sayi - 10 : sayi + 20;
        System.out.println("Ternary metodu ile: " + sayi);
    }
}
