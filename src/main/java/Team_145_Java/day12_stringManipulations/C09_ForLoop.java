package Team_145_Java.day12_stringManipulations;

import java.util.Scanner;

public class C09_ForLoop {
    public static void main(String[] args) {
        //Kullanicidan bir sayi isteyin
        //1'den baslayarak, girilen sayiya kadar (sayi dahil)
        //butun tam sayilari aralarida bır bosluk birakarak yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        for (int i = 1; i <= sayi; i++) {
            System.out.print(i+" ");
        }
    }
}
