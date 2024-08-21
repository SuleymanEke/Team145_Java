package Team_145_Java.day15_methodOlusturmaVeKullanma;

public class C06_MetniTerseCevir {
    public static void main(String[] args) {

        //verilen metnin tersten yazilisini donduren bir method olusturun

        System.out.println(metniTersineCevir("Dogdugun yer vatan mi, doydugun yer vatan mi?"));

        //"ey edip adanada pide ye" palindrome mu?
        String metin = "ey edip adanada pide ye";
        String tersMetin = metniTersineCevir(metin);

        if (metin.equalsIgnoreCase(tersMetin)) {
            System.out.println("Verilen metin paindrome");
        } else {
            System.out.println("Verilen metin palindrome degildir");
        }
    }

    public static String metniTersineCevir(String metin) {
        String tersMetin = "";
        for (int i = metin.length() - 1; i >= 0; i--) {
            tersMetin += metin.charAt(i);
        }
        return tersMetin;
    }


}
