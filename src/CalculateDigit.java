import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class CalculateDigit {

    public static void myCalculateDigit() {

        Scanner myScanner = new Scanner(System.in);

        // Get a number from user.

        System.out.print("Bir sayı giriniz : ");
        int number = myScanner.nextInt();

        int result = 0;

        // Calculate the sum of digits.

        result = number % 10;

        while (number != 0) {
            number /= 10;
            result += number % 10;
        }

        System.out.println("Girdiğiniz sayının basamakları toplamı : " + result);










    }
}
