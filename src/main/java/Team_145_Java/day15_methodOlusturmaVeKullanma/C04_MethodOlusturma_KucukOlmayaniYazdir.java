package Team_145_Java.day15_methodOlusturmaVeKullanma;

public class C04_MethodOlusturma_KucukOlmayaniYazdir {
    public static void main(String[] args) {

        //Verilen iki tamsayidan kucuk olmayani yazdirin
        //bir tane de verilen 3 sayidan en kucuk olani yazdiran method olusturun
        //eger edit olanlar varsa esitlerden birini yazdirin

        kucukOlmayaniYazdir(7, 9);
    }

    public static void kucukOlmayaniYazdir(int sayi1, int sayi2) {
        System.out.println(sayi1 < sayi2 ? sayi2 : sayi1);


    }


}
