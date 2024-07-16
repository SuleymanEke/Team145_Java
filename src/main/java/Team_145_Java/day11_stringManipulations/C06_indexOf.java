package Team_145_Java.day11_stringManipulations;

import java.util.Scanner;

public class C06_indexOf {
    public static void main(String[] args) {

        //Kullanicinin girdigi metin'nde birden fazla a harfi oldugu bilinyorsa, 2. a'nin index'ini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz: ");
        String str = scanner.nextLine();

        int ilkKullanimIndexi = str.indexOf("a");
        int ikinciKullanimIndexi = str.indexOf("a", ilkKullanimIndexi + 1);
        System.out.println("2. a'nin index'i: " + ikinciKullanimIndexi);
    }
}
