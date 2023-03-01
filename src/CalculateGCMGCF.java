import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class CalculateGCMGCF {

    public static void calculateGCMGCF () {

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan iki sayı iste

        System.out.print("1. sayıyı giriniz: ");
        int num1 = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        int num2 = input.nextInt();

        // Ebob değerini hesapla
        int ebob = findEbob(num1, num2);

        // Ekok değerini hesapla
        int ekok = findEkok(num1, num2, ebob);

        System.out.println("Girilen sayıların ebob değeri: " + ebob);
        System.out.println("Girilen sayıların ekok değeri: " + ekok);
    }

    // Ebob değerini hesaplamak için fonksiyon
    public static int findEbob(int num1, int num2) {
        int ebob = 1;

        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
            }
        }

        return ebob;
    }

    // Ekok değerini hesaplamak için fonksiyon
    public static int findEkok(int num1, int num2, int ebob) {
        int ekok = (num1 * num2) / ebob;

        return ekok;
    }
}
