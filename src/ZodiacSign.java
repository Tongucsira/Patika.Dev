import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class ZodiacSign {

    public static void myZodiacSign (){

        Scanner input = new Scanner(System.in);

        int day, month;

        System.out.println("Burç hesaplama programına hoşgeldiniz.");
        System.out.println("Aşağıdaki bilgileri giriniz.");
        System.out.print("Doğduğunuz gün (1 - 31)   : ");
        day = input.nextInt();

        System.out.print("Doğduğunuz ay (1 = Ocak)  : ");
        month = input.nextInt();

        // Convert month number to month name

        String monthName;
        switch (month) {
            case 1:
                monthName = "Ocak";
                break;
            case 2:
                monthName = "Şubat";
                break;
            case 3:
                monthName = "Mart";
                break;
            case 4:
                monthName = "Nisan";
                break;
            case 5:
                monthName = "Mayıs";
                break;
            case 6:
                monthName = "Haziran";
                break;
            case 7:
                monthName = "Temmuz";
                break;
            case 8:
                monthName = "Ağustos";
                break;
            case 9:
                monthName = "Eylül";
                break;
            case 10:
                monthName = "Ekim";
                break;
            case 11:
                monthName = "Kasım";
                break;
            case 12:
                monthName = "Aralık";
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");
                return;
        }

        // Combine day and month into a single string
        String birthDate = String.format("%d %s", day, monthName);
        System.out.println("Doğumgününüz " + birthDate);

        if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
            System.out.println("Oğlak Burcu");
        } else if ((month == 1 && day >= 22) || (month == 2 && day <= 19)) {
            System.out.println("Kova Burcu");
        } else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
            System.out.println("Balık Burcu");
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
            System.out.println("Koç Burcu");
        } else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
            System.out.println("Boğa Burcu");
        } else if ((month == 5 && day >= 22) || (month == 6 && day <= 22)) {
            System.out.println("İkizler Burcu");
        } else if ((month == 6 && day >= 23) || (month == 7 && day <= 22)) {
            System.out.println("Yengeç Burcu");
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            System.out.println("Aslan Burcu");
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            System.out.println("Başak Burcu");
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            System.out.println("Terazi Burcu");
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            System.out.println("Akrep Burcu");
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            System.out.println("Yay Burcu");
        } else {
            System.out.println("Hatalı giriş yaptınız.");


        }
    }
}
