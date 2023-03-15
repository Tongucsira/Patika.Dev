import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class RecursivePower {

    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    static void myRecursivePower() {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int base = myScanner.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int exponent = myScanner.nextInt();
        System.out.println("Sonuç: " + power(base, exponent));

        System.out.println();
        myRecursivePower();
    }
}
