import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class FindBigAndSmall {

    public static void findBigAndSmall() {

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan kaç tane sayı gireceğini soruyoruz.

        System.out.print("Kaç tane sayı gireceksiniz? ");
        int n = input.nextInt();

        // Kullanıcıdan sayıları alıyoruz.

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Kullanıcının girdiği sayıları karşılaştırıyoruz.

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int num = input.nextInt();

            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // En küçük ve en büyük sayıyı ekrana yazdırıyoruz.

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}



