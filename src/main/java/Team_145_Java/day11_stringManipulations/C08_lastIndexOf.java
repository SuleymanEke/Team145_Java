package Team_145_Java.day11_stringManipulations;

public class C08_lastIndexOf {
    public static void main(String[] args) {

        String str = "ali topu tut, tut ali tut";

        //cumlede "tut"un ilk kullanim index'i
        System.out.println(str.indexOf("tut"));

        //cumlede "tut"un ikinci kullanim index'i
        System.out.println(str.indexOf("tut", 10));

        //cumlede "tut"un ucuncu kullanim index'i
        System.out.println(str.indexOf("tut", 15));

        //cumlede "ali"nin ilk kullanim index'i
        System.out.println(str.indexOf("ali"));

        //cumlede "top"un ilk kullanim index'i
        System.out.println(str.indexOf("top"));

        //cumlede "ali"nin son kullanim index'i
        System.out.println(str.lastIndexOf("ali"));

        //cumlede "top"un son kullanim index'i
        System.out.println(str.lastIndexOf("top"));

    }
}
