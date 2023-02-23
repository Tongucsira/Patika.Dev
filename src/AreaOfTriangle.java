import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class AreaOfTriangle {

    public static void myAreaOfTriangle(){
        double a, b, c, u, A;

        Scanner input = new Scanner(System.in);

        System.out.print("a kenarı değerini giriniz   : ");
        a = input.nextDouble();

        System.out.print("b kenarı değerini giriniz   : ");
        b = input.nextDouble();

        System.out.print("c kenarı değerini giriniz   : ");
        c = input.nextDouble();

        u = (a+b+c) /2;

        A = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Alan : " + A);
    }
}
