import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class ActivityAdvisor {

    public static void myActivityAdvisor(){
        int temperature;

        Scanner myscanner = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz : ");
        temperature = myscanner.nextInt();

        if (temperature < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (temperature >= 5 && temperature <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (temperature >= 15 && temperature <= 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
