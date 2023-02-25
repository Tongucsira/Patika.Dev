import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class HypotenuseCalculator {

    public static void myHyptenuseCalculator() {

        Scanner myScanner = new Scanner(System.in);

        //Kullanıcıdan a ve b kenarlarını alıyoruz.

        int a, b, c;

        //Hipotenüsü hesaplamak için a ve b kenarlarının karesini alıyoruz.

        System.out.print("a kenarı değeri :");
        a = myScanner.nextInt();

        System.out.print("b kenarı değeri :");
        b = myScanner.nextInt();

        c = ((a * a) + (b * b));
        System.out.println("Hipotenüs : " + Math.sqrt(c));
    }
}
