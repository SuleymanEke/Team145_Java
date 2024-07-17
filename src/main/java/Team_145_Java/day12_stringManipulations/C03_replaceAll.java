package Team_145_Java.day12_stringManipulations;

public class C03_replaceAll {
    public static void main(String[] args) {

        //Soru 2: Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        // input1 : "15.30 $" , input2 : "11.45 $"
        // output : "26.70 $"

        String fiyatStr1 = "15.30 $";
        String fiyatStr2 = "11.45 $";

        System.out.println(fiyatStr1 + " " + fiyatStr2); //15.30 $ 11.40 $

        fiyatStr1 = fiyatStr1.replaceAll("\\D", "");
        fiyatStr2 = fiyatStr2.replaceAll("\\D", "");

        double fiyat1 = Double.parseDouble(fiyatStr1);
        double fiyat2 = Double.parseDouble(fiyatStr2);

        fiyat1 /= 100;
        fiyat2 /= 100;
        System.out.println((fiyat1 + fiyat2 + " $"));


    }
}
