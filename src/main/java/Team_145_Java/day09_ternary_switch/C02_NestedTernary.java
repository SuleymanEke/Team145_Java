package Team_145_Java.day09_ternary_switch;

public class C02_NestedTernary {
    public static void main(String[] args) {

        int sayi = 21;

        //Verilen sayi pozitif ise "pozitif",
        //negatif ise "negatif"

        System.out.println(sayi > 0 ? "pozitif" : sayi < 0 ? "negatif" : "notr");

    }
}
