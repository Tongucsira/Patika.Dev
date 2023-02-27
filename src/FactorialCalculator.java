import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class FactorialCalculator {

    public static void myFactorialCalculator () {

        Scanner myScanner = new Scanner(System.in);

        // Kullanıcıdan sayı alıyoruz.

        System.out.print("Please enter a number: ");
        int n = myScanner.nextInt();
        int total = 1;

        for (int i = 1; i <= n; i++) {
            total *= i;
        }

        // Faktöriyel sonucunu yazdırıyoruz.

        System.out.println(n + "!   : " + total);
    }
}
