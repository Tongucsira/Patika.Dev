import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class UpSideDownTriangle {

    public static void upSideDownTriangle() {

        Scanner myScanner = new Scanner(System.in);

        // Kullanıcıdan basamak sayısını alıyoruz.

        System.out.print("Basamak sayısını giriniz: ");
        int n = myScanner.nextInt();
        int m = (n - 1);

        for (int a = 1; a < n; a++) {                                // Satır Sayısı

            for (int b = 0; b <= a; b++) {                           // Boşluk Sayısı
                System.out.print(" ");
            }
            for (int c = (2 * (n - a)) - 1; c >= 1; c--) {           // Yıldız Sayısı
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



