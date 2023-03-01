import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class FibonacciSequence {

    public static void fibonacciSequence() {

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan basamak sayısını alıyoruz.

        int n, t1 = 0, t2 = 1;
        System.out.print("Fibonacci serisi için eleman sayısını girin: ");
        n = input.nextInt();

        // Fibonacci serisini ekrana yazdırıyoruz.

        System.out.print("Fibonacci Serisi: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
