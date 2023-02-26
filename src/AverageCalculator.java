import java.util.Scanner;

public class AverageCalculator {
    public static void myAverageCalculator() {

        Scanner sc = new Scanner(System.in);

        // Getting the numbers from the user.

        System.out.print("Bir sayı girin: ");
        int n = sc.nextInt();
        System.out.print("ilk çarpanı girin: ");
        int a = sc.nextInt();
        System.out.print("İkinci çarpanı girin: ");
        int b = sc.nextInt();
        int counter = 0;
        int total = 0;

        int c = a * b;

        // Calculating the average.

        for (int i = 0; i <= n; i++) {
            if (i % c == 0) {
                counter++;
                total += i;
            }
        }

        // Printing the result.

        double average = (double) total / (counter);

        System.out.println("Sayıların " + c + "'ile tam bölünenlerinin ortalaması: " + average);
    }
}






