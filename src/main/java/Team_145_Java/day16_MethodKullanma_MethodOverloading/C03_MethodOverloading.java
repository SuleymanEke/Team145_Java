package Team_145_Java.day16_MethodKullanma_MethodOverloading;

public class C03_MethodOverloading {
    public static void main(String[] args) {
        /*

        Bir class'ta ismi ayni ama signature'i farkli methodlar olusuturlmasina OverLoading denir.

        Bir class'ta ayni isimle birden fazla method olusturulabilir.

        Java'da bir metod cagirildiginda eger ayni isimde birden fazla metod varsa
        Java argumentlerle parametrelerin uyumuna bakar.
        Java'da bir class icerisinde ayni isimde birden fazla metod olusturulabilir
        ancak bu metodlarin signature'lari farkli olmalidir.
        Method Signature == method adi + parametrelerin data turleri.
        Eger method call'daki signature'a uygun bir metod yoksa CTE olusur,
        Java kodu kirmizi cizer ve kod calismaz.

         */

        String str = "Java Candir";

        System.out.println(str.substring(3));

        System.out.println(str.substring(3, 7));

        topla(3, 7);
        topla(7, 3.8);

    }

    public static void topla(int sayi1, int sayi2) {
        System.out.println("Iki int sayinin toplami: " + (sayi1 + sayi2));
    }

    public static void topla(int sayi1, double sayi2){
        System.out.println("int ve double iki sayisinin toplami: "+(sayi1+sayi2));
    }


}
