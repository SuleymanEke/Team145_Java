package Team_145_Java.day14_forLoop_methodOlusturma;

import java.util.Scanner;

public class C08_NestedForLoop {
    public static void main(String[] args) {

        /*
        kullanicidan satir ve sutun sayisini alip asagidaki sekli cizdirin
        0
        0 1
        0 1 2
        0 1 2 3
        0 1 2 3 4
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz: ");
        int satir = scanner.nextInt();

//        System.out.println("Lutfen sutun sayisini giriniz: ");
//        int sutun = scanner.nextInt();

        for (int i = 1; i <= satir; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j - 1 + " ");
            }
            System.out.println("");
        }


    }
}
