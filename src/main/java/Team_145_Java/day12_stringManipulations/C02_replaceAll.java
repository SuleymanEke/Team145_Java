package Team_145_Java.day12_stringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {

        //verilen bir metindeki coklu space'leri tek space haline getirip
        //sayilari silip, space disindaki ozel karakterleri yok edin
        //J12$*av)(a    C?and&^ir ==> Java Candir

        String str = "J12$%av)(a    C?and&^ir";

        //verilen metindeki coklu space'leri tek space haline getirip,
        str = str.replaceAll("\\s+", " ");

        //sayilari silip,
        str = str.replaceAll("\\d", "");

        //space disindaki ozel karakterleri yok edin
        //20. satirdaki kod calisinca ozel karakterler ile birlikte space de gidiyor
        //once space'i korumaya almaliyiz
        //sayilari temizledigimiz icin space'in yerine herjangi bir rakam koyarsak
        //sonrasinda space'in yerini bulmamiz kolay olacak.
        str = str.replaceAll("\\s", "5");

        //space koruma altina alindigi icin geriye kalan ozel karakterleri yok edebiliriz
        str = str.replaceAll("\\W", "");
        System.out.println(str);

        //artik korumayi alip yerine 5 yazdigimiz space'i yerine dondurelim
        str = str.replaceAll("5", " ");
        System.out.println(str);

        //W ozel karakterleri yok eder ama _ kalir, bunun icin ekstra bir satir yazalim
        str = str.replaceAll("_", "");
        System.out.println(str);
    }
}
