import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class CalculationsOfCircle {
    public static void myCalculationOfCircle() {

        double pi = 3.14;
        double r, alpha, sliceArea;

        // Kullanıcıdan yarıçap ve merkez açısı ölçüsü değerleri alınır.
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını girin     : ");
        r = input.nextDouble();
        System.out.print("Daire diliminin merkez açısının ölçüsünü girin    : ");
        alpha = input.nextDouble();

        // Dairenin çevresi
        double cevre    = 2* pi * r;
        double alan     = pi * r * r;

        // Daire diliminin alanı hesaplanır.
        sliceArea = (pi * Math.pow(r, 2) * alpha) / 360;

        // Sonuçlar ekrana yazdırılır.
        System.out.println("Dairenin çeresi         : " + cevre + "m");
        System.out.println("Dairenin alanı          : " + alan + "m²");
        System.out.println("Daire diliminin alanı   : " + sliceArea + "m²");
    }
}
