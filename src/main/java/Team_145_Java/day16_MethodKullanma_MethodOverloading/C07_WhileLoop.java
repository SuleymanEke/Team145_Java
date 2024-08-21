package Team_145_Java.day16_MethodKullanma_MethodOverloading;

public class C07_WhileLoop {
    public static void main(String[] args) {

        //1'den 10'a kadar tum sayilari toplayin

        int toplam = 0;
        for (int i = 1; i <= 10; i++) {
            toplam += i;
        }
        System.out.print("Toplama isleminin sonucu: " + toplam);
        System.out.println();

        //2-'den 30'a kadar olan sayilari (20 ve 30 dahil) while loop ile toplayin
        toplam=0;
        int i=20;

        while(i<=30){
            toplam+=i;
            i++;
        }
        System.out.print("Toplama isleminin sonucu: " + toplam);
    }
}
