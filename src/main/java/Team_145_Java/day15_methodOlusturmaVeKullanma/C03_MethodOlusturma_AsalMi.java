package Team_145_Java.day15_methodOlusturmaVeKullanma;

public class C03_MethodOlusturma_AsalMi {
    public static void main(String[] args) {

        //Verilen bir sayi asal ise true, asal degilse false yazdiran bir method olusturun

        asalMi(17);

        /*
        method deklarasyonunda () icindeki variable'lara PARAMETRE
        method call'da () icindeki degerlere ARGUMENT denilir

        eger parametre ve argument uyumlu olmazsa
        Java Compiler Error Verir ve kod calistirilamaz
        Uyumlu olmak icin parametre ve argumentlerin
        hem kac tane oldugu, hem de data turleri onemlidir
         */
    }

    public static void asalMi(int sayi) {
        boolean asalMi = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % 2 == 0) {
                asalMi = false;
                break;
            }
        }
        System.out.println(asalMi);

    }


}
