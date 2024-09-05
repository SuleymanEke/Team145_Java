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
        String metin = scanner.nextLine();

        String[] krkler = metin.split("");
        System.out.println(Arrays.toString(krkler));



    }
}
