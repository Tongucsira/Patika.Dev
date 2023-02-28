import java.util.Scanner;

public class PowerCalculator {


    public static void myPowerCalculator() {

        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan sayı alıyoruz.

        double int1, int2;
        double result;

        System.out.print("Bir sayı giriniz : ");
        int1 = scan.nextInt();
        System.out.print("Üssünü giriniz : ");
        int2 = scan.nextInt();
        result = 1;

        // Kullanıcının girdiği sayının istenilen kuvvetini yazdırıyoruz.

        if (int1 == 0 && int2 < 0) {
            System.out.println("Tanımsız");
        } else {
            if (int2 == 0) {
                System.out.println("1");
            }
            if (int2 > 0) {
                System.out.println(int1 + " sayısının " + int2 + ". kuvveti");
                for (int i = 1; i <= int2; i++) {

                    result *= int1;
                }
                System.out.println(result);
            }
            if (int2 < 0) {
                int2 = Math.abs(int2);
                System.out.println(int1 + " sayısının " + int2 + ". kuvveti");
                int1 = (1 / int1);
                for (int i = 1; i <= int2; i++) {

                    result *= int1;
                }
                System.out.println(result);
            }
        }
    }
}