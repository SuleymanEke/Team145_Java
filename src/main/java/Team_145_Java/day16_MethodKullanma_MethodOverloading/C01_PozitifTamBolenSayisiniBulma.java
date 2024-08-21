package Team_145_Java.day16_MethodKullanma_MethodOverloading;

public class C01_PozitifTamBolenSayisiniBulma {
    public static void main(String[] args) {

        //Verilen sayinin pozitif tam bolenleri sayisini bulup bize donduren bir method olusturun.

        System.out.println(pozitifTamBolenSayisi(100));



    }

    public static int pozitifTamBolenSayisi(int sayi) {
        int pozTamBolenSayisi = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                pozTamBolenSayisi++;
            }
        }
        return pozTamBolenSayisi;
    }
}
