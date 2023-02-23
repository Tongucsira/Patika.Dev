import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class GPACalculator {
    
    public static void myGPACalculator() {
        // Değişkenleri oluştur
        int mathematic, physics, chemistry, turkish, history, music;

        // Scanner sınıflarını tanımla
        Scanner inp = new Scanner(System.in);

        // Kulanıcıdan değerleri al

        System.out.print("Matematik notunuz :");
        mathematic = inp.nextInt();

        System.out.print("Fizik notunuz :");
        physics = inp.nextInt();

        System.out.print("Kimya notunuz :");
        chemistry = inp.nextInt();

        System.out.print("Türkçe notunuz :");
        turkish = inp.nextInt();

        System.out.print("Tarih notunuz :");
        history = inp.nextInt();

        System.out.print("Müzik notunuz :");
        music = inp.nextInt();

        // ortalamanın hesaplanması

        int total = (mathematic + physics + chemistry + turkish + history + music);
        double result = total / 6.0;
        System.out.println("Ortalamanız : " + result);

        // Geçip geçmediğini görmek

        boolean condition = result >= 60;

        String str = condition ? "Geçti" : "Kaldı";
        System.out.println(str);
    
    }
    
}
