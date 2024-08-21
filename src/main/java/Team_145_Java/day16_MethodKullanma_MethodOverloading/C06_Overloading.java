package Team_145_Java.day16_MethodKullanma_MethodOverloading;

public class C06_Overloading {
    public static void main(String[] args) {

        topla(2, 3);
        topla(2.5f, 3);
        topla(2.5f, 3.5f);
        topla(2, 3.4);

    }

    public static void topla(int sayi) {
        System.out.println();
    }

    public static void topla(int a, int b) {
        System.out.println("int int: " + (a + b));
    }

    public static void topla(double c, int d) {
        System.out.println("double int: " + (c + d));
    }

    public static void topla(float c, int d) {
        System.out.println("float int: " + (c + d));
    }

    public static void topla(double c, double d) {
        System.out.println("double double: " + (c + d));
    }
}
