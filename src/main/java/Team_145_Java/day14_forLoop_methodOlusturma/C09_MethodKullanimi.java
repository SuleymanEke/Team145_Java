package Team_145_Java.day14_forLoop_methodOlusturma;

public class C09_MethodKullanimi {
    public static void main(String[] args) {

        //Kullanicidan bir sayi isteyin
        //sayinin asal olup olmadigini yazdirin
        //sayiyi tam bolen sayilarin listesinin yazdirin
        //sayinin faktoryel degerini hesaplayin

        String str = "java candir";
        boolean aVarMi = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                aVarMi = true;
            }
        }
        System.out.println(aVarMi);

        //Yukaridaki kodu anlamak mi daha kolay yoksa asagidaki satiri mi?
        System.out.println(str.contains("a"));
        str=str.toUpperCase();
        System.out.println(str);

    }

}
