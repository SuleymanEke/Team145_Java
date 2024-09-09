package Team_145_Java.day22_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_ListedenElemanSilme {
    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>(Arrays.asList("A", "G", "K", "A", "M", "A"));
        System.out.println(harfler); //[A, G, K, A, M, A]

        harfler.remove("A");
        System.out.println(harfler); //[G, K, A, M, A]

        System.out.println(harfler.remove("A"));

        System.out.println(harfler); //[G, K, M, A]

        System.out.println(harfler.remove("X"));

        System.out.println(harfler);

        //eger silmek icin index verirsek
        System.out.println(harfler.remove(2));
        System.out.println(harfler); //[G, K, A]

        //System.out.println(harfler.remove(6)); //hata verir.

        List<String> harfler2 = new ArrayList<>(Arrays.asList("A", "K"));
        System.out.println(harfler.removeAll(harfler2));
        System.out.println(harfler);

        //listeyi tertemiz etmek istersek
        harfler.clear();;
        System.out.println(harfler);


    }
}
