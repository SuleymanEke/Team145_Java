package Team_145_Java.day12_stringManipulations;

import java.util.Scanner;

public class C04_replaceAll {
    public static void main(String[] args) {

        //Kullanicidan ismini, soyismini ve kredi karti numarasini alin
        //isim ve soyismin ilk harfini buyuk harfe cevirip, kalanini * yapin
        //kredi karti numarasindaki sayilari * yapip asagidaki formatta yazdirin

        //isminiz : A** Y***** // Ali Mert Yozgat
        //Kart no : **** **** **** ****

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz: ");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz: ");
        String soyisim = scanner.nextLine();

        System.out.println("Lutfen kredi karti numaranizi giriniz: ");
        String kartNo = scanner.nextLine();

        System.out.println("Isminiz: " + isim.substring(0, 1).toUpperCase()
                + isim.substring(1).replaceAll("\\S", "*"));
        System.out.println("Soyisminiz: " + soyisim.substring(0, 1).toUpperCase()
                + soyisim.substring(1).replaceAll("\\S", "*"));
        System.out.println("Kredi karti Bilgileriniz: " + kartNo.replaceAll("\\d", "*"));


    }
}
