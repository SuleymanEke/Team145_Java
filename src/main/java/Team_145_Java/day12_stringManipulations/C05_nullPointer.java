package Team_145_Java.day12_stringManipulations;

public class C05_nullPointer {
    public static void main(String[] args) {

        //Java'da method icerisinde deger atamadan variable deklare edebilirsiniz
        //Ancak deger atamasi yapmadan variable'i kullanamazsiniz

        String ogrenci1;
        String ogrenci2;
        String ogrenci3;

        ogrenci1 = "Cem Adrian";

        //Java'da bir deger atadigimizda Java o degerin anlamli olup olmamasina bakmaz
        //variable'lari deger atanmis veya atanmamis olarak ayirir

        ogrenci2 = "";
        ogrenci3 = "";
        System.out.println(ogrenci1 + ", " + ogrenci2 + ", " + ogrenci3);

        //bu atamalari yaparsak, Java'ya deger atanmamis kac variable var? diye sordugumuzda

        //Bize oyle bir cozum gerekiyor ki,
        //Hem deger atayalim
        //hem de yazdirabilelim ve yazdirdigimizda deger atanmamis oldugunu gorelim

        String ogrenci4 = null;
        //null Java'nin ozel bir cozumudur
        //null bir deger degil bir ISARETCIDIR
        //gorevi sadece "ogrenci4"e deger atanmadi demektir
        System.out.println(ogrenci4);


    }
}
