package Team_145_Java.day22_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ListMetodlari {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma"));
        System.out.println(isimler);

        isimler.add(0, "Mehmed");
        System.out.println(isimler); //[Mehmed, Ali, Veli, Ayse, Fatma]

        isimler.add(2, "Gul");
        System.out.println(isimler); //[Mehmed, Ali, Gul, Veli, Ayse, Fatma]

        isimler.set(2, "Ahmet");
        System.out.println(isimler); //[Mehmed, Ali, Ahmet, Veli, Ayse, Fatma]

        isimler.set(isimler.size()-1, "Zeynep");
        System.out.println(isimler); //[Mehmed, Ali, Ahmet, Veli, Ayse, Zeynep]



    }
}
