import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class PlaneTicketPrice {

    public static void myPlaneTicketPriceCalculator() {

        //normalPrice = 0.10 * distance;
        //age (0 - 11 = Child, 12 - 24 = Student, 25 - 65 = Adult, 66 - 120 = Senior)
        //ageDiscount = (age <= 11) discount = %50
        //ageDiscount = (age >= 12 && age <= 24) discount = %10
        //ageDiscount = (age >= 25 && age <= 65) discount = %0
        //ageDiscount = (age >= 66 && age <= 120) discount = %30
        //ticketType (Type 1 = One Way, Type 2 = Round Trip)
        //roundTripDiscount = (ticketType == 2) discount = %20
        //totalDiscount = ageDiscount + roundTripDiscount
        //FinalPrice = normalPrice - (normalPrice * totalDiscount / 100)

        Scanner input = new Scanner(System.in);

        int distance, age, ticketType;
        double normalPrice, ageDiscount, roundTripDiscount, totalDiscount, finalPrice;

        System.out.print("Mesafeyi km cinsinden giriniz : ");
        distance = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş) : ");
        ticketType = input.nextInt();

        // Calculating normal price
        normalPrice = 0.10 * distance;

        // Calculating age discount
        if (age <= 11) {
            ageDiscount = 50.0;
        } else if (age >= 12 && age <= 24) {
            ageDiscount = 10.0;
        } else if (age >= 66 && age <= 120) {
            ageDiscount = 30.0;
        } else {
            ageDiscount = 0.0;
        }

        // Calculating round trip discount
        roundTripDiscount = (ticketType == 2) ? 20.0 : 0.0;

        // Calculating total discount
        totalDiscount = ageDiscount + roundTripDiscount;

        // Calculating final price
        finalPrice = normalPrice - (normalPrice * totalDiscount / 100);

        // Discount Total

        double  discountTotal = normalPrice - finalPrice;

        // Printing results

        System.out.println("Toplam Fiyat = " + normalPrice);
        System.out.println("Yaş İndirimi = %" + ageDiscount);
        System.out.println("Gidiş Dönüş İndirimi = %" + roundTripDiscount);
        System.out.println("Toplam İndirim = %" + totalDiscount);
        System.out.println("İndirim Tutarı = " + discountTotal);
        System.out.println("Ödemeniz Gereken Tutar = " + finalPrice);
    }

    public static void main(String[] args) {
        myPlaneTicketPriceCalculator();




    }
}
