package Team_145_Java.day18_scope;

import java.util.Scanner;

public class C02_ClassLevelVariables {

    /*
    1 - Class'in icinde ama metodlarin disinda olusturulan variable'ara Class Level Variable denir.
    2 - Class Variable'lar class icerinde herhangi bir yerde olabilir ancak kullanim kolayligi acisindan
    class'in en ust tarafinda olusturulurlar.
    3 - Class Level Variable'lar, Local Variable'lardan farkli olarak static olarak da isaretlenebilir.
    4 - Class Level Variable'lardan static olarak isaretlenenlere ===> static variables
    static olarak isaretlenmeyenlere ise ===> instance variables denir.
    5 - Class Level Variable'larin Scope'un butun class'in yani class'in her yerinden kullanilabilirler.
    6 - Ancak instance ve static variable'lar her yerden Direkt olarak kullanilamazlar. Direkt erisim icin
    anahtar kelime "static"dir.
    7 - static keyword'e sahip variable'lar heryerden kullanilabilir(method'un static olmasina veya
    olmamasina bakmayiz.)
    instance (static keyword'a sahip olmayan) variable'lar her yerden direkt kullanilamazlar.
    static olmayan method'larda istance variable'lar direkt kullanilabilirler.
    Ancak static method'larda Direkt Kullanilamazlar, obje olusturulmasi gerekiyor.
    8 - Hem static variable'lar hem de istance variable'lar deger atanmadan olusturulabilirler ve
    deger atanmadan kullanilabilirler.
    Eger biz bir deger atamadiysak Java default olarak
    char ==> hiclik
    boolean ==> false
    sayisal primitive'ler ==> 0
    non-primitive'ler ==> null degerlerini atar.



     */

    int sayi1 = 10;
    String str1 = "Ali";
    boolean bl;
    char ch;
    String str2;
    double sayi2;

    static int sayi3 = 20;
    static String str3 = "Veli";
    static boolean bl2;
    static char ch2;
    static String str4;
    static double sayi4;


    public static void main(String[] args) {
        System.out.println("Main Mehtod sayi3: " + sayi3);
        System.out.println("Main Mehtod str3: " + str3);
        System.out.println("Main Mehtod bl2: " + bl2);
        System.out.println("Main Mehtod ch2: " + ch2);
        System.out.println("Main Mehtod str4: " + str4);
        System.out.println("Main Mehtod sayi4: " + sayi4);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        //bir scanner objesu olusturun
        Scanner scanner = new Scanner(System.in);
        //Java'da genel obje olusturma syntax'i aynidir.
        //Eger icinde bulundugumuz C02_ClassLevelVariables class'tan bir obje bulundurmak istersek

        C02_ClassLevelVariables obj = new C02_ClassLevelVariables();
        obj.sOlmayanMethod();


        



    }

    public static void sMethod() {
        System.out.println("sayi3: " + sayi3);


    }

    public void sOlmayanMethod() {
        System.out.println("sOlmayanMethod sayi3: " + sayi3);
        System.out.println("sOlmayanMethod sayi1: " + sayi1);
        System.out.println("sOlmayanMethod str1: " + str1);
        System.out.println("sOlmayanMethod bl:" + bl);
        System.out.println("sOlmayanMethod ch:" + ch);
        System.out.println("sOlmayanMethod str2:" + str2);
        System.out.println("sOlmayanMethod sayi2:" + sayi2);


    }
}
