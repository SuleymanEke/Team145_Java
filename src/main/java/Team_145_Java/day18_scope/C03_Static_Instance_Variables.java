package Team_145_Java.day18_scope;

public class C03_Static_Instance_Variables {
    public static String hIsmi = "Yildiz Hastanesi";
    public static String hTelefonu = "0312 234 34 34";
    public static String hAdresi = "Cankaraya, Ankara";
    public String perIsmi = "Isim atanmadi";
    public String perAdresi = "Adres atanmadi";
    public String perTelefonu = "Telefon atanmadi";

    public static void main(String[] args) {

        C03_Static_Instance_Variables per1 = new C03_Static_Instance_Variables();

        System.out.println(per1.perAdresi);
        System.out.println(per1.perIsmi);
        System.out.println(per1.perTelefonu);

        per1.perAdresi = "Yenimahalle, Ankara";
        per1.perIsmi = "Volkan Can";
        per1.perTelefonu = "0532 123 45 67";

        System.out.println(per1.perAdresi);
        System.out.println(per1.perIsmi);
        System.out.println(per1.perTelefonu);

        System.out.println("Hastane Ismi: " + hIsmi);
        System.out.println("Hastane Adresi: " + hAdresi);
        System.out.println("Hastane Telefonu: " + hTelefonu);

        System.out.println(per1.hIsmi);

        C03_Static_Instance_Variables per2 = new C03_Static_Instance_Variables();

        System.out.println(per2.perAdresi);
        System.out.println(per2.perIsmi);
        System.out.println(per2.perIsmi);

        per2.perAdresi = "Ulus, Ankara";
        per2.perIsmi = "Ahmet Can";
        per2.perTelefonu = "0542 123 45 67";

        System.out.println(per2.perAdresi);
        System.out.println(per2.perIsmi);
        System.out.println(per2.perTelefonu);

        per2.hAdresi = "Altindag, Ankara";
        System.out.println(hAdresi);
        System.out.println(per2.hAdresi);
        System.out.println(per1.hAdresi);

        per1.hAdresi = "Sincan, Ankara";
        System.out.println(per2.hAdresi);
        System.out.println(per2.hAdresi);


    }

}
