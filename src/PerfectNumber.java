import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class PerfectNumber {

    public static void perfectNumber() {

        Scanner myScanner = new Scanner(System.in);

        // Kullanıcıdan sayıyı alıyoruz.

        System.out.print("Sayıyı giriniz: ");
        int a = myScanner.nextInt();

        // Sayının mükemmel olup olmadığını kontrol ediyoruz.

        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }

        // Sonucu ekrana yazdırıyoruz.

        if (sum == a) {
            System.out.println("Sayı mükemmel sayıdır.");
        } else {
            System.out.println("Sayı mükemmel sayı değildir.");
        }
    }
}
