import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class CalculateGCMGCF {

    public static void calculateGCMGCF () {

        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        int num1 = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        int num2 = input.nextInt();

        int ebob = 1;
        int i = 1;
        while (i <= num1 && i <= num2) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        int ekok = (num1 * num2) / ebob;

        System.out.println("Girilen sayıların ebob değeri: " + ebob);
        System.out.println("Girilen sayıların ekok değeri: " + ekok);
    }
}
