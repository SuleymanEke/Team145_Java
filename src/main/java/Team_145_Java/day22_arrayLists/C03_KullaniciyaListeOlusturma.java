package Team_145_Java.day22_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_KullaniciyaListeOlusturma {
    public static void main(String[] args) {

        //Kullanicidan istedigi kadar isim alip 0'a bastiginda isim alma islemini bitirip
        // aldigi isimleri bir liste olarak bize donduren bir metod olusturun.

        System.out.println(isimListOlustur());

    }

    public static List<String> isimListOlustur() {
        Scanner scanner = new Scanner(System.in);
        List<String> isimler = new ArrayList<>();
        String girilenIsim = "";
        while (!girilenIsim.equals("0")) {
            System.out.println("Luten listeye eklemek icin bir isim giriniz: \nBitirmek icin 0'a basiniz!");
            girilenIsim = scanner.nextLine();
            if (!girilenIsim.equals("0")) {
                isimler.add(girilenIsim);
            }
        }
        return isimler;
    }
}
