package Team_145_Java.day11_stringManipulations;

public class C03_endsWith {
    public static void main(String[] args) {

        String str = "Java ogrenmek cok zevkli";

        //metin "zevkli" ile mi bitiyor?
        System.out.println(str.endsWith("zevkli"));

        //metin "li" ile mi bitiyor?
        System.out.println(str.endsWith("li"));

        //metin "vkli" ile mi bitiyor?
        System.out.println(str.endsWith("vkli"));

        //metin "Java ogrenmek cok zevkli" ile mi bitiyor?
        System.out.println(str.endsWith("Java ogrenmek cok zevkli"));

        //metin "" ile mi bitiyor?
        System.out.println(str.endsWith(""));

    }
}
