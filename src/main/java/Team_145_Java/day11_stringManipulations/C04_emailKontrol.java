package Team_145_Java.day11_stringManipulations;

import java.util.Scanner;

public class C04_emailKontrol {
    public static void main(String[] args) {

        //Soru: kullanicidan bir mail alin,
        // -mail @ icermiyorsa "Gecersiz mail.",
        // -mail @gmail.com icermiyorsa "Mail gmail olmali.",
        // -mail @gmail.com ile bitmiyorsa, "Mailde yazim hatasi var." yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen email adresinizi giriniz: ");
        String email = scanner.nextLine();

        if (!email.contains("@")) {
            System.out.println("Gecersiz mail");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("Mail gmail olmali");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("Mailde yazim hatasi var.");
        } else {
            System.out.println("Lutfen gmail iceren bir mail adresi giriniz! ");
        }


    }
}
