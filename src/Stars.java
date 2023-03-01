import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class Stars {

    public static void stars () {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        int n = myScanner.nextInt();
        int m = (n - 1);

        for (int i = 1; i <= n; i++) {                          // Satır Sayısı

            for (int j = n - i; j >= 0; j--) {                      // Boşluk Sayısı
                System.out.print(" ");
            }
            for (int z = 0; z < (2 * i) - 1; z++) {                 // Yıldız Sayısı
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = 1; a < n; a++) {                           // Satır Sayısı

            for (int b = 0 ; b <= a; b++) {                         // Boşluk Sayısı
                System.out.print(" ");
            }
            for (int c = (2 * (n - a)) - 1; c >= 1; c--) {          // Yıldız Sayısı
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


