import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class TaxiFee {

    public static void myTaxiFee(){
        Scanner input = new Scanner(System.in);
        double km, of = 10, total;

        System.out.print("Geçilen km     : " );
        km = input.nextDouble();

        total = of + (km * 2.20);
        total = (total < 20) ? 20 : total;

        System.out.println("Toplam : " + total);


    }
}
