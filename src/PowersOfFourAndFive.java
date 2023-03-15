import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class PowersOfFourAndFive {

    public static void myPowersOfFourAndFive() {

        Scanner sc = new Scanner(System.in);

        // Kullanıcıdan sayı alıyoruz.

        int n;
        System.out.print("Bir sayı giriniz : ");
        n = sc.nextInt();

        // Kullanıcı negatif sayı girdiğinde uyarı veriyoruz.

        if (n < 0) {
            System.out.print("Lütfen pozitif bir sayı giriniz : ");
            n = sc.nextInt();
        }

        // 4 ve 5'in kuvvetlerini yazdırıyoruz.

        System.out.println("4'ün kuvvetleri");
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }
        System.out.println("-----------------");

        System.out.println("5'in kuvvetleri");
        for (int j = 1; j <= n; j *= 5) {
            System.out.println(j);
        }
    }
}
