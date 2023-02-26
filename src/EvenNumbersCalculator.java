import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class EvenNumbersCalculator {
    public static void myOddCalculator() {

        Scanner sc = new Scanner(System.in);

        int n;
        int total = 0;

        do {
            System.out.print("Bir sayı girin: ");
            n = sc.nextInt();
            if (n % 2 == 0 || n % 4 ==0) {
                total += n;
            }
        }
        while (n % 2 == 0);

        System.out.println("Girilen sayıların toplamı: " + total);
    }
}

