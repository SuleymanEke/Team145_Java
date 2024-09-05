package Team_145_Java.day20_arrays_MultiDimentionalArrays;

public class C04_EnUzunVeEnKisaKelime {
    public static void main(String[] args) {
        //Verilen bir Strin array'indeki en uzun ve en kisa kelimeleri yazdiran bir metod olusturun

        String[] isimler = {"Cem Karaca", "Emel Sayin", "Volkan Konak", "Sener Sen", "Kemal Sunal"};
        enKisaVeEnUzunIsmiYazdir(isimler);
    }

    public static void enKisaVeEnUzunIsmiYazdir(String[] isimler) {
        String enUzunKelime = isimler[0];
        String enKisaKelime = isimler[0];
        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].length() > enUzunKelime.length()) {
                enUzunKelime = isimler[i];
            }

            if (isimler[i].length() < enKisaKelime.length()) {
                enKisaKelime = isimler[i];
            }
        }
        System.out.println("En uzun isim: " + enUzunKelime);
        System.out.println("En kisa isim: " + enKisaKelime);
    }
    //20. ders 00:53'e geldim.


}
