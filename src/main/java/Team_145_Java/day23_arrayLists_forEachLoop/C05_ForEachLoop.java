package Team_145_Java.day23_arrayLists_forEachLoop;

import java.util.Arrays;

public class C05_ForEachLoop {
    public static void main(String[] args) {

        //Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa "Harf cumlede kullanilmamistir" yazdirin.

        String cumle = "Biz de voltrani olusturalim";
        String arananHarf = "e";

        String[] karakterler = cumle.replaceAll("[^a-zA-Z]", "").split("");
        System.out.println(Arrays.toString(karakterler)); //[B, i, z,  , d, e,  , v, o, l, t, r, a, n, i,  , o, l, u, s, t, u, r, a, l, i, m]

        int sayac = 0;

        for (String each : karakterler) {

            if (each.equals(arananHarf)) {
                sayac++;
            }
        }
        if (sayac == 0) System.out.println("Harf cumlede kullanilmamistir");
        else System.out.println("Verilen " + arananHarf + " harfi cumlede " + sayac + " adet kullanilmistir");
    }
}
