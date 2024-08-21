package Team_145_Java.day16_MethodKullanma_MethodOverloading;

public class C06_Overloading_Extra01 {
    public static void main(String[] args) {

        System.out.println(carpim(2, 3));
        System.out.println(carpim(2, 3.4));
        System.out.println(carpim(2, 3, 5));


    }

    public static double carpim(double sayi1, double sayi2){
        return sayi1*sayi2;
    }

    public static int carpim(int sayi1, int sayi2){
        return sayi1*sayi2;
    }

    public static double carpim(double sayi1, double sayi2, double sayi3){
     return sayi1*sayi2*sayi3;
    }


}
