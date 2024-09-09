package Team_145_Java.day22_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C11_PozitifTamBolenlerListesi {
    public static void main(String[] args) {

        // Verilen pozitif bir tam sayiyi, tam bolebilen tum pozitif tam sayilari
        // bir liste olarak bize donduren bir metod olusturun.

        System.out.println("40: " + getPozitifTamBolenler(40));
        System.out.println("45:" + getPozitifTamBolenler(45));
        System.out.println("50: " + getPozitifTamBolenler(50));
        System.out.println("55: " + getPozitifTamBolenler(55));
        System.out.println("60: " + getPozitifTamBolenler(60));

    }

    public static List<Integer> getPozitifTamBolenler(int sayi) {

        List<Integer> tamBolenlerListesi = new ArrayList<>();
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                tamBolenlerListesi.add(i);
            }
        }
        return tamBolenlerListesi;
    }
}


