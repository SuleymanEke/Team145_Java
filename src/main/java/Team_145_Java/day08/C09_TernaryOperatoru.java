package Team_145_Java.day08;

import java.util.Scanner;

public class C09_TernaryOperatoru {
    public static void main(String[] args) {

        //kullanicidan bir tam sayi alin
        //sayi cift ise "cift sayi", degilse "tek sayi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Cift sayi");
        } else {
            System.out.println("Tek sayi");
        }

        //If Else ile yapilanbilen basit islemlerde 4 satir kod yazmak yerine
        // ternary operatoru ile tek satirda isi cozeriz.

        System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        //Ternary Operatoru
        System.out.println(sayi % 2 == 0 ? "Cift sayi" : "Tek sayi");


    }
}
