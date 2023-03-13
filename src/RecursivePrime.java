import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class RecursivePrime {

    static void myRecursivePrime() {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int a = myScanner.nextInt();

        int count = 0;

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Sayı asal sayıdır.");
        } else {
            System.out.println("Sayı asal sayı değildir.");
        }

        myRecursivePrime();

    }
}
