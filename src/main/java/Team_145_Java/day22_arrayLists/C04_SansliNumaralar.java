package Team_145_Java.day22_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class C04_SansliNumaralar {
    public static void main(String[] args) {

        //Calistirdigimizda bir milyondan kucuk sayilardan sansli 5 sayi secip
        // bir liste olarak bize donduren bir metod olusturun.

        System.out.println(getSansliSayilar());
        System.out.println(getSansliSayilar());
        System.out.println(getSansliSayilar());
        System.out.println(getSansliSayilar());
        System.out.println(getSansliSayilar());
        System.out.println(getSansliSayilar());

        //Verilen baslangic ve bitis degerleri arasinda 5 tane sansli sayi secip
        // bir liste olarak donduren bir metod olusturun.
        //sayilar birbirinden farkli olmalidir.

        System.out.println(istenenAraliktanSansliSayiUret(10, 16));


    }

    public static List<Integer> istenenAraliktanSansliSayiUret(int baslangic, int bitis) {

        //Ornek olarak 2200 ile 3000 arasinda bes sayi uretsin.

        List<Integer> sansliSayilarList = new ArrayList<>();

        Random random = new Random();

        while (sansliSayilarList.size() < 5) {
            int sayi = random.nextInt(bitis - baslangic);
            if (!sansliSayilarList.contains(sayi + baslangic)) {
                sansliSayilarList.add(sayi + baslangic);
            }
        }

        return sansliSayilarList;
    }

    public static List<Integer> getSansliSayilar() {

        List<Integer> sansliSayilarList = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int sayi = random.nextInt(1000000);
            sansliSayilarList.add(sayi);
        }

        return sansliSayilarList;
    }
}
