import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class PrimeNumbers {

    public static void primeNumbers () {

        Scanner myScanner = new Scanner(System.in);

        // Kullanıcıdan sayıyı alıyoruz.

        System.out.print("Sayıyı giriniz: ");
        int a = myScanner.nextInt();

        // Sayının asal olup olmadığını kontrol ediyoruz.

        int count = 0;

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                count++;
            }
        }

        // Sonucu ekrana yazdırıyoruz.

        if (count == 0) {
            System.out.println("Sayı asal sayıdır.");
        } else {
            System.out.println("Sayı asal sayı değildir.");
        }
    }
}