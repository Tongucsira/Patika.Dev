import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class NumberSorting {

    public static void myNumberSorting() {

        Scanner input = new Scanner(System.in);

        // 3 tane sayı girilir ve küçükten büyüğe doğru sıralanır.

        int a, b, c, temp;

        System.out.print("a değerini giriniz : ");
        a = input.nextInt();

        System.out.print("b değerini giriniz : ");
        b = input.nextInt();

        System.out.print("c değerini giriniz : ");
        c = input.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("a < b < c");
            } else {
                System.out.println("a < c < b");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("b < a < c");
            } else {
                System.out.println("b < c < a");
            }
        } else if ((c < a) && (c < b)) {
            if (a < b) {
                System.out.println("c < a < b");
            } else {
                System.out.println("c < b < a");
            }
        }
    }
}
