package Team_145_Java.day13_forLoop;

public class C02_DikkatEdilecekler {

    public static void main(String[] args) {

        //Eger ilk deger icin condition true vermezse loop body'si hic calismaz.
        for (int i = 10; i > 100; i++) {
            System.out.print(i);
        }


        // Eger artirma/azaltma yaptigimiz halde condition hep true oluyorsa
        //Teknik olarak sonsuz loop olusur
        for (int i = 10; i > 0; i++) {
            System.out.print(i + " ");
        }


    }
}
