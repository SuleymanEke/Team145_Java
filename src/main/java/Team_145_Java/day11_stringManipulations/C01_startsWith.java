package Team_145_Java.day11_stringManipulations;

public class C01_startsWith {
    public static void main(String[] args) {

        String str = "Java cok guzel";

        //str Java ile mi basliyor?
        System.out.println(str.startsWith("Java"));

        //str J ile mi basliyor?
        System.out.println(str.startsWith("J"));

        //str Ja ile mi basliyor?
        System.out.println(str.startsWith("Ja"));

        //str Java cok ile mi basliyor?
        System.out.println(str.startsWith("Java cok"));

        //str "j" ile mi basliyor?
        System.out.println(str.startsWith("j"));

        //str "a" ile mi basliyor?
        System.out.println(str.startsWith("a"));

        //str "Java cok guzel" ile mi basliyor?
        System.out.println(str.startsWith("Java cok guzel"));

        //5.index sonrasi "cok" ile mi basliyor?
        System.out.println(str.startsWith("cok", 5));
        System.out.println(str.startsWith(" ", 8));


    }
}
