import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class HarmonicSeries {

    public static void HarmonicSeries() {

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan sayı alıyoruz.

        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();
        double result = 0;

        // Kullanıcının girdiği sayıya kadar harmonik seriyi yazdırıyoruz.

        for (int i = 1; i <= number; i++) {
            result += (double) 1 / i;
        }

        // Sonucu yazdırıyoruz.

        System.out.println("Harmonik Seri Sonucu : " + result);

    }
}
