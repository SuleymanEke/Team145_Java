package Team_145_Java.day20_arrays_MultiDimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C09_MetniSifrele {
    public static void main(String[] args) {

        //Kullanicidan bir metin isteyin ve asagida verilen yontemle sifreli hale getirin
        //tum metin kucuk harfle cevrilecek
        //harfler disindaki karakterler sifrelenmyecek
        //harflerin yerine o harften 3 sonraki harf getirilecek
        //or: a==> d, k==>n, y==>b, z==>c

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sifrelenecek metni giriniz: ");
        String metin = scanner.nextLine().toLowerCase();

        String[] karakterler = metin.split("");
        System.out.println(Arrays.toString(karakterler));

        for (int i = 0; i < karakterler.length; i++) {

            if (metin.charAt(i) >= 'a' && metin.charAt(i) <= 'w') { //a <==> w
                karakterler[i] = (char) (metin.charAt(i) + 3) + "";
            } else if (metin.charAt(i) >= 'x' && metin.charAt(i) <= 'z') { //x <==> z
                karakterler[i] = (char) (metin.charAt(i) + 3 - 26) + "";
            } // kucuk harf olmayan karakterler aynen kalacak
        }
        System.out.println(Arrays.toString(karakterler));

        //split() metodunun tam tersi join() metodudur.
        String yeniMetin = String.join("", karakterler);
        System.out.println(yeniMetin);
    }
}

        /*=====================================================*\

        /*
        String[] kelimeler = metin.split(" ");
        System.out.println("Kelimeler: " + Arrays.toString(kelimeler));

        String[] harfler = metin.replaceAll("[^a-zA-Z]", "").split("");
        System.out.println("Harfler: " + Arrays.toString(harfler));

        for (int i = 0; i < harfler.length; i++) {

            if (metin.charAt(i) >= 'a' && metin.charAt(i) <= 'w') {
                harfler[i] = (char) (metin.charAt(i) + 3) + "";
            } else if (metin.charAt(i) >= 'x' && metin.charAt(i) <= 'z') {
                harfler[i] = (char) (metin.charAt(i) + 3 - 26) + "";
            }
        }
        System.out.println(Arrays.toString(harfler));

         */
