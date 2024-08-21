package Team_145_Java.day17_whileLoop_doWhileLoop;

public class C07_Karsilastirma {
    public static void main(String[] args) {

        /*
        - while Loop once sarti kontrol edip sarti sagliyorsa islem yaptirir.
        do whileLoop ise once islem yaptirir, sonra sarti kontrol eder.

        - do whileLoop'un artisi da eksisi de budur.
        Eger en azindan bir kere loop body'sinin calismasini isterseniz avantaj olur.
        Eger sarti saglamiyorsa Hic Calismasin derseniz dezavantaj olur.

        1. eger baslangic ve bitis belliyse for loop
        2. eger kac kere tekrar edecegimizi bilmiyorsak while veya do while loop kullanilir.
        3. eger body'nin en azindan bir kere Mutlaka calismasini istiyorsak do while loop kullanilir.
         */

        int sayi = -20;

        while (sayi > 0) {
            System.out.println("While Loop sonucu: " + sayi + " ");
            sayi--;
        }
        System.out.println("=============================================");
        do {
            System.out.println("Do While Loop sonucu: " + sayi + " ");
            sayi--;

        } while (sayi > 0);
    }
}
