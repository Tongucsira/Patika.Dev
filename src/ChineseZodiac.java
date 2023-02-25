import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class ChineseZodiac {

    public static void myChineeseZodiacCalculator() {

        Scanner input = new Scanner(System.in);

        // Doğum yılını kullanıcıdan alıyoruz.

        System.out.print("Doğum yılınızı girin: ");
        int year = input.nextInt();

        String zodiac = "Çin Zodyağı Burcunuz : ";

        // Doğum yılına göre çin zodyağı burcunu buluyoruz.

        String[] sign = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};

        // Burcunuzu ekrana yazdırıyoruz.

        switch (year % 12) {
            case 0:
                System.out.println(zodiac + sign[0]);
                break;
            case 1:
                System.out.println(zodiac + sign[1]);
                break;
            case 2:
                System.out.println(zodiac + sign[2]);
                break;
            case 3:
                System.out.println(zodiac + sign[3]);
                break;
            case 4:
                System.out.println(zodiac + sign[4]);
                break;
            case 5:
                System.out.println(zodiac + sign[5]);
                break;
            case 6:
                System.out.println(zodiac + sign[6]);
                break;
            case 7:
                System.out.println(zodiac + sign[7]);
                break;
            case 8:
                System.out.println(zodiac + sign[8]);
                break;
            case 9:
                System.out.println(zodiac + sign[9]);
                break;
            case 10:
                System.out.println(zodiac + sign[10]);
                break;
            case 11:
                System.out.println(zodiac + sign[11]);
                break;


        }
    }
}
