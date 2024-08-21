package Team_145_Java.day13_forLoop;

public class C03_BasitForLoop {
    public static void main(String[] args) {

        //1000'den geri dogru 3 basamakli 37 ile bolunebilen sayilari yazdirin
        for (int i = 1000; i >= 100; i--) {
            if (i % 37 == 0) {
                System.out.print(i + " ");
            }
        }

        //verilen pozitif tamsayi degeri icin faktoryel degerini hesaplayin
        int sayi =5;
        int faktoryelDegeri=1;
        for (int i = sayi; i >=1 ; i--) {
            faktoryelDegeri*=i;
        }
        System.out.println("Faktoryel degeri: "+faktoryelDegeri);




    }
}

