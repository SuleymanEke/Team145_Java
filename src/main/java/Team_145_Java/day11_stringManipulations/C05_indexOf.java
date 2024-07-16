package Team_145_Java.day11_stringManipulations;

public class C05_indexOf {
    public static void main(String[] args) {

        String str = "cok calismam lazim, cok";

        //str calis iceriyor mu?
        System.out.println(str.contains("calis"));

        //str clasi ile basliyor mu?
        System.out.println(str.startsWith("calis"));

        //str calis ile bitiyor mu?
        System.out.println(str.endsWith("calis"));

        //Pekii bu calis cumlenin neresinde?
        System.out.println(str.indexOf("calis"));

        //str'da kullanilan ilk 'a'nin index'si
        System.out.println(str.indexOf("a"));

        //str'da kullanilan ilk "cok"un index'si
        System.out.println(str.indexOf("cok"));

        //str'da kullanilan son 'a'nin index'si
        System.out.println(str.lastIndexOf("a"));

        //str'da kullanilan ilk " " index'si
        System.out.println(str.indexOf(' '));

        //str'da kullanilan ilk 'a'nin index'sinin 5 oldugu biliniyorsa, ikinci 'a'nin index'si nedir?
        System.out.println(str.indexOf('a', 6));

        //str'da kullanilan ilk "cok"un index'sinin 0 oldugu biliniyorsa, ikinci "cok"un index'si nedir?
        System.out.println(str.indexOf("cok", 1));

        //str'da kullanilan son 'x'in index'si
        System.out.println(str.indexOf('x')); //-1


    }
}
