import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class TaxiFee {

    public static void myTaxiFee() {

        Scanner input = new Scanner(System.in);

        // 20 TL'den az ücret alınmaz.
        // 1 km başına 2.20 TL ücret alınır.

        double km, of = 10, total;

        //Kullanıcıdan km bilgisini alıyoruz.

        System.out.print("Geçilen km     : ");
        km = input.nextDouble();

        // Toplam ücreti hesaplıyoruz.

        total = of + (km * 2.20);
        total = (total < 20) ? 20 : total;

        System.out.println("Toplam : " + total);


    }
}
