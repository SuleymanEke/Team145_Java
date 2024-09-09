package Team_145_Java.day21_multiDimentionalArrays_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C07_ArrayList {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        System.out.println(isimler);

        System.out.println(isimler.add("Cem"));
        System.out.println(isimler);

        isimler.add(0, "Murat");
        System.out.println(isimler);
    }
}
