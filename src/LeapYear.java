import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class LeapYear {

    public static void myLeapYearCalculator() {

        Scanner myScanner = new Scanner(System.in);

        // Kullanıcıdan yıl bilgisini alıyoruz.

        System.out.print("Yıl girin: ");
        int year = myScanner.nextInt();

        // Girilen yılın artık yıl olup olmadığını kontrol ediyoruz.

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + " artık yıldır.");
        else
            System.out.println(year + " artık yıl değildir.");
    }
}