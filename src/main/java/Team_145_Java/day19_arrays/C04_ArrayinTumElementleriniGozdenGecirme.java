package Team_145_Java.day19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArrayinTumElementleriniGozdenGecirme {
    public static void main(String[] args) {

        int[] arr = {3, 7, 9, 1, 3, 0, 5};

        //array'i yazdirin
        System.out.println(Arrays.toString(arr)); //[3, 7, 9, 1, 3, 0, 5]

        //array'in tum elemanlarinin toplamini yazdirin.
        //Bir array'in tum elemanlarini gozden gecirmeniz veya kullanmaniz gerekirse for loop kullaniriz.
        int elemanlarinTopllami = 0;
        for (int i = 0; i < arr.length; i++) {
            elemanlarinTopllami += arr[i];
        }
        System.out.println("Elemanlarin Topllami: " + elemanlarinTopllami);

        //array'deki cift sayi adedini ve tek sayi adedini yazdirin
        int ciftSayiAdedi = 0;
        int tekSayiAdedi = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                ciftSayiAdedi++;
            } else { // sift degilse
                tekSayiAdedi++;
            }
        }
        System.out.println("Cift sayi adedi: " + ciftSayiAdedi);
        System.out.println("Tek sayi adedi: " + tekSayiAdedi);

        //array'in tum elemanlarini aralarinda bir bosluk birakarak yazdirin
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //kullanicidan bir sayi alin ve array'de kullanicinin girdigi sayi varsa kac adet oldugunu,
        //verilen sayi array'de yoksa "Girilen sayi array'de yok" yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz: ");
        int girilenSayi = scanner.nextInt();

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == girilenSayi) {
                sayac++;
            }
        }

        if (sayac == 0) {
            System.out.println("Girilen sayi array'de yok");
        } else {
            System.out.println("Girilen " + girilenSayi + " sayi array'de " + sayac + " adet bulunmaktadir.");
        }


    }
}
