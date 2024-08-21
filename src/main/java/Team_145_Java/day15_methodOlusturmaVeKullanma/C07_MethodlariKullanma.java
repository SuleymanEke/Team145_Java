package Team_145_Java.day15_methodOlusturmaVeKullanma;

public class C07_MethodlariKullanma {
    public static void main(String[] args) {

        //6! 'i yazdirin
        C02_MethodOlusturma.faktoryelDegeriYazdir(6); //6! = 720

        //10! 'i yazdirin
        C02_MethodOlusturma.faktoryelDegeriYazdir(10); //10! = 3628800

        //Verilen sayi asal ise true, asal degilse false yazdirin
        C03_MethodOlusturma_AsalMi.asalMi(17);

        //Kullanicidan 2 sayi alin ve buyuk olmayani yazdirin
        C04_MethodOlusturma_KucukOlmayaniYazdir.kucukOlmayaniYazdir(17, 19);

        //ismi duzenle
        System.out.println(C05_IsimDuzenleme.ismiDuzenle("cem", "Karaca"));

        //MEHMED Ali erbil ismini duzenleyip, olusturdugumuz yeniOgrenci String'ine atayin
        String yeniOgrenci = C05_IsimDuzenleme.ismiDuzenle("MEHMED", "Ali");
        System.out.println(yeniOgrenci);

    }


}
