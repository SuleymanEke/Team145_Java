package Team_145_Java.day11_stringManipulations;

import java.util.Scanner;

public class C10_lastIndexOf {
    public static void main(String[] args) {

        String str ="ali topu tut, tut ali tut";

        // tut kelimesinin son kullanim index'i nedir?
        System.out.println(str.lastIndexOf("tut")); //22

        // tut kelimesinin sondan ikinci kullanim index'i nedir?
        System.out.println(str.lastIndexOf("tut", 21)); //14

        // tut kelimesinin sondan ucuncu kullanim index'i nedir?
        System.out.println(str.lastIndexOf("tut", 13)); //9



    }
}
