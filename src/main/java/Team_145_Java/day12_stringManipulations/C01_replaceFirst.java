package Team_145_Java.day12_stringManipulations;

import java.util.Scanner;

public class C01_replaceFirst {
    public static void main(String[] args) {

        String str = "Ali topu at, at Ali at topu at";

        //t harflerini T yapin
        System.out.println(str.replace('t', 'T'));
        System.out.println(str.replace("t", "T"));

        //cumleden kullanilan ilk a yerine X yazin
        System.out.println(str.replace('a', 'X'));
        System.out.println(str.replace('X', 'a'));
        System.out.println(str.replaceFirst("A", "X"));

        //kullanicidan bir metin isteyiniz
        //girilen metinde varsa, ilk kullanilan sayi yerine X yaziniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz: ");
        String metin = scanner.nextLine();

        System.out.println(metin.replaceFirst("\\d", "X"));
        System.out.println(metin.replaceAll("\\w", "*"));

        //kullanicidan kredi karti numarasini isteyin
        //kullanici kart numarasi arasinda bosluklara birakabilir
        //bosluklara dokunmadan, sadece sayilarina yerine * yazdirin

        System.out.println("Lutfen kart numarasi giriniz: ");
        String kartNo = scanner.nextLine();

        System.out.println(kartNo.replaceAll("\\d", "*"));



    }
}
