package Team_145_Java.day13_forLoop;

import java.util.Scanner;

public class C04_AradakiSayilarinToplami {
    public static void main(String[] args) {

        //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilari alin,
        //sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Baslangic degeri olarak pozitif tamsayi giriniz: ");
        int baslangic = scanner.nextInt();
        System.out.println("Bitis degeri olarak pozitif tamsayi giriniz: ");
        int bitis = scanner.nextInt();

        int toplam = 0;
        if (bitis < baslangic || baslangic < 0 || bitis < 0) {
            System.out.println("Baslangic ve bitis degeri uygun degil.");
        } else {

            for (int i = baslangic; i <= bitis; i++) {
                toplam += i;
                System.out.print(toplam + " ");
            }
            System.out.println(" - Girilen degerler arasindaki tamsayilarin topami: " + toplam);
        }

    }
}
