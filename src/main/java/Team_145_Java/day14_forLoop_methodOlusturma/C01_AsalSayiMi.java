package Team_145_Java.day14_forLoop_methodOlusturma;

import java.util.Scanner;

public class C01_AsalSayiMi {
    public static void main(String[] args) {

        //Kullanicidan pozitif bir tamsayi isteyip,
        //sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz: ");
        int sayi = scanner.nextInt();

        boolean asalMi = true;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                System.out.println("Girilen sayi asal degil");
                asalMi = false;
                break;
            }
        }

        if (asalMi==true){
            System.out.println("Girilen sayi asal");
        }


    }
}
