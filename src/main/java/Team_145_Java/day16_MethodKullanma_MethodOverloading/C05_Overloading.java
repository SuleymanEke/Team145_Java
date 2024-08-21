package Team_145_Java.day16_MethodKullanma_MethodOverloading;

public class C05_Overloading {
    public static void main(String[] args) {
        /*
        Java method call'daki siganture'a %100 uyumlu olan bir method bulamazsa
        auto-widening kullanarak calistirabilecegi method var mi diye kotrol eder
        ve varsa calisitirir.
         */

        topla(3, 4);
        topla(3.1f, 4.5);
        topla('a', 'b');
        //topla("a", "b");
    }

    public static void topla(double a, double b) {
        System.out.println("Iki double'in toplami: " + (a + b));
    }
}
