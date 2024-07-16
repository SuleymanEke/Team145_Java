package Team_145_Java.day11_stringManipulations;

public class C12_replace {
    public static void main(String[] args) {

        String str = "Bugun hava ne kadar da guzel";

        //str'daki tum 'a'lari 'A' yapin
        System.out.println(str.replace('a', 'A'));

        //Bugun'u Dun yapalim
        System.out.println(str.replace("Bugun", "Dun"));

        //str'daki tum 'e'leri yok edin
        System.out.println(str.replace("e", ""));



    }
}
