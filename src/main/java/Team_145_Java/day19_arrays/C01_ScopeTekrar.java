package Team_145_Java.day19_arrays;

import Team_145_Java.day18_scope.C03_Static_Instance_Variables;

public class C01_ScopeTekrar {
    public static void main(String[] args) {
        C03_Static_Instance_Variables obj1 = new C03_Static_Instance_Variables();
        System.out.println(obj1.perAdresi);
        System.out.println(obj1.perIsmi);
        System.out.println(obj1.perAdresi);

        System.out.println(obj1.hIsmi);

        System.out.println(C03_Static_Instance_Variables.hIsmi);
        String geldigimYer ="19. ders = 00.41";



    }
}
