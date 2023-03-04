import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class FibonacciRecursive {

    public static void myFibonacciRecursive() {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Kaç adet Fibonacci sayısı istiyorsunuz? : ");
        int n = myScanner.nextInt();


        fib(n);
    }

    static void fib(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static int fibonacci(int n) {
         if (n <= 2) {
            return 1;
        }
         else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
