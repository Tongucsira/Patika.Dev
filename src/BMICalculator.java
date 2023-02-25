import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class BMICalculator {

    public static void myBMICalculator() {

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değerleri alıyoruz.

        double height, weight;

        System.out.print("Boyunuzu giriniz (m) : ");
        height = input.nextDouble();
        System.out.print("Kilonuzu giriniz (kg) : ");
        weight = input.nextDouble();

        // Vücut kitle indeksini hesaplıyoruz.

        double bmi = weight / (height * height);
        System.out.println("Vücut kitle indeksiniz : " + bmi);
        String vki = bmi > 25 ? "Kilo vermeniz gerekli" : "Kilonuz ideal";

        /// Vücut kitle indeksine göre ekrana yazdırıyoruz.

        System.out.println(vki);

    }
}
