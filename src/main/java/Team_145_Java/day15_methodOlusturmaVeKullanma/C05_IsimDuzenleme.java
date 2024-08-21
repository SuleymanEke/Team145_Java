package Team_145_Java.day15_methodOlusturmaVeKullanma;

public class C05_IsimDuzenleme {
    public static void main(String[] args) {

        //Verilen isim ve soyismi alip
        //Isim ve soyismin ilk harflerini buyuk diger harfler kucuk olacak sekilde duzenleyip,
        //isim bosluk soyisim seklinde bize donduren bir method olusturun
        // input : isim => Ali --- soyisim => YILMAZ. output : Ali Yilmaz

        ismiDuzenle("ali", "kerim");
        // method calisir ama getirdigi ismiDuzenle'den almadik
        //kapici ekmegi getirdi ama ondan almadik

        System.out.println(ismiDuzenle("suleyman", "eke"));
        //method ismi duzenler, hemen kullandigimiz icin sonraya bir sey kalmaz
        //kapici ekmegi getirdi, biz de ekmegi yiyip bitirdik

        System.out.println(ismiDuzenle("volkan", "konak"));

        String isminYeniHali = ismiDuzenle("veli", "kucuk");
        //method ismin duzenlenmis halini getirdi, biz de daha sonra kullanmak uzere bunu kaydettik
        //kapici ekmegi getirdi, biz de ondan alip saklama kutusuna koyduk
        //istedigimiz zaman da baska bir variable'a atayabiliriz
        String yeniOgrenciIsmi = isminYeniHali;
        System.out.println(yeniOgrenciIsmi);

    }

    public static String ismiDuzenle(String isim, String soyisim) {
        String duzenlemisIsim = isim.substring(0, 1).toUpperCase()
                + isim.substring(1).toLowerCase()
                + " " + soyisim.substring(0, 1).toUpperCase()
                + soyisim.substring(1).toLowerCase();
        return duzenlemisIsim;
    }

}
