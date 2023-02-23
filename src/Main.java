import java.util.Scanner;

/**
 * @author Tonguç Şira
 */

public class Main {


    public static void main(String[] args) {

        int n1, n2, selection;

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println(n1 + "- " + n2);

        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        System.out.print("Seçiminiz: ");
        selection = input.nextInt();

        System.out.println("Seçiminiz: ");

        switch (selection) {
            case 1:
                System.out.println("Toplama: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma: " + (n1 * n2));
                break;
            case 4:

                switch (n2) {
                    case 0:
                        System.out.println("Bir sayı 0'a bölünemez!");
                        break;
                    default:
                        System.out.println("Bölme: " + (n1 / n2));
                }
                break;

            default:
                System.out.println("Hatalı seçim! Lütfen geçerli bir seçim yapın.");
                selection = input.nextInt();
                break;



        }





    }
}