import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class HypotenuseCalculator {

    public static void myHyptenuseCalculator() {
        int a, b, c;
        Scanner inp =  new Scanner(System.in);

        System.out.print("a kenarı değeri :");
        a = inp.nextInt();

        System.out.print("b kenarı değeri :");
        b = inp.nextInt();

        c = ((a*a)+(b*b));
        System.out.println("Hipotenüs : " + Math.sqrt(c));
    }
}
