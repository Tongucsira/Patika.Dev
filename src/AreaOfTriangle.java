import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class AreaOfTriangle {

    public static void myAreaOfTriangle() {

        Scanner input = new Scanner(System.in);

        // Üçgenin kenar uzunluklarını kullanıcıdan alıyoruz.

        double a, b, c, u, A;

        // Üçgenin alanını hesaplayıp ekrana yazdırıyoruz.

        System.out.print("a kenarı değerini giriniz   : ");
        a = input.nextDouble();

        System.out.print("b kenarı değerini giriniz   : ");
        b = input.nextDouble();

        System.out.print("c kenarı değerini giriniz   : ");
        c = input.nextDouble();

        u = (a + b + c) / 2;

        // Herhangi bir kenar uzunluğu üçgenin diğer iki kenar uzunluğundan büyük olamaz.

        A = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Alan : " + A);
    }
}
