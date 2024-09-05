package Team_145_Java.day20_arrays_MultiDimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03_KullaniciyaArrayOlusturma {
    public static void main(String[] args) {
        //Kullanicidan array'in boyutunu ve elemanlarini alip array'in olusturan
        // ve bize donduren bir method olusturun.

        String[] isimler = kullaniciyaStringArrayOlusturt();
        System.out.println("Isimler: " + Arrays.toString(isimler));

    }

    public static String[] kullaniciyaStringArrayOlusturt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kac isimlik bir array olusturmak istersiniz: ");
        int length = scanner.nextInt();
        scanner.nextLine();

        String[] isimler = new String[length];
        for (int i = 0; i < isimler.length; i++) {
            System.out.println("Array'e eklenmek uzere bir isim giriniz: ");
            isimler[i] = scanner.nextLine();
        }
        return isimler;

        //20. ders 00.34.54'e geldim

    }

}
