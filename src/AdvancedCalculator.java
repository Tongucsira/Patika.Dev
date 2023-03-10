import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class AdvancedCalculator {

    public static void myAdvancedCalculator() {

        Scanner myScanner = new Scanner(System.in);


        System.out.println("Advanced Calculator");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");
        System.out.println("5. Üslü Sayı");
        System.out.println("6. Karekök");
        System.out.println("7. Faktöriyel");
        System.out.println("8. Mod");
        System.out.println("9. Dikdörtgen Alanı ve Çevresi");

        System.out.print("Seçiminiz: ");
        int selection = myScanner.nextInt();
        double result = 0;

        switch (selection) {
            case 1:
                // Addition
                result = 0;
                System.out.print("Kaç adet sayı toplamak istiyorsunuz? : ");
                int n = myScanner.nextInt();
                for (int i = 1; i <= n; i++) {
                    System.out.print(i + ". sayıyı giriniz: ");
                    int nAddition = myScanner.nextInt();
                    result += nAddition;
                }
                System.out.println("Toplam: " + result);

                //return to selection
                System.out.println("-----------------------------");
                System.out.println("Başka bir işlem yapmak istiyor musunuz? (E/H)");
                String answer = myScanner.next();
                if (answer.equals("E") || answer.equals("e")) {
                    myAdvancedCalculator();
                } else {
                    System.out.println("Çıkış yapılıyor...");
                }
                break;
            case 2:
                // Subtraction
                System.out.print("Eksilen sayıyı giriniz? : ");
                int n1 = myScanner.nextInt();
                result = n1;
                System.out.print("Kaç adet sayı çıkarmak istiyorsunuz? : ");
                int nSubtraction = myScanner.nextInt();
                for (int i = 1; i <= nSubtraction; i++) {
                    System.out.print(i + ". sayıyı giriniz: ");
                    int n2 = myScanner.nextInt();
                    result -= n2;
                }
                System.out.println("Çıkarma: " + result);

                //return to selection
                System.out.println("-----------------------------");
                System.out.println("Başka bir işlem yapmak istiyor musunuz? (E/H)");
                String answer2 = myScanner.next();
                if (answer2.equals("E") || answer2.equals("e")) {
                    myAdvancedCalculator();
                } else {
                    System.out.println("Çıkış yapılıyor...");
                }
                break;
            case 3:
                // Multiplication
                result = 1;
                System.out.print("Kaç adet sayı çarpmak istiyorsunuz? : ");
                int nMultiplication = myScanner.nextInt();
                for (int i = 1; i <= nMultiplication; i++) {
                    System.out.print(i + ". sayıyı giriniz: ");
                    int n3 = myScanner.nextInt();
                    result *= n3;
                }
                System.out.println("Çarpma: " + result);
                //return to selection
                System.out.println("-----------------------------");
                System.out.println("Başka bir işlem yapmak istiyor musunuz? (E/H)");
                String answer3 = myScanner.next();
                if (answer3.equals("E") || answer3.equals("e")) {
                    myAdvancedCalculator();
                } else {
                    System.out.println("Çıkış yapılıyor...");
                }
                break;
            case 4:
                // Division
                result = 0;
                System.out.print("Bölünen : ");
                int nDividend = myScanner.nextInt();
                System.out.print("Bölen : ");
                int nDivisor = myScanner.nextInt();
                int result2 = nDividend / nDivisor;
                System.out.println("Sonuç : " + result2);
                //return to selection
                System.out.println("-----------------------------");
                System.out.println("Başka bir işlem yapmak istiyor musunuz? (E/H)");
                String answer4 = myScanner.next();
                if (answer4.equals("E") || answer4.equals("e")) {
                    myAdvancedCalculator();
                } else {
                    System.out.println("Çıkış yapılıyor...");
                }
                break;
            case 5:
                // Power
                System.out.print("Taban sayıyı giriniz: ");
                int n4 = myScanner.nextInt();
                System.out.print("Üs sayısını giriniz: ");
                int n5 = myScanner.nextInt();
                int power = (int) Math.pow(n4, n5);
                System.out.println(n4 + " sayısının " + n5 + ". kuvveti : " + power);
                //return to selection
                System.out.println("-----------------------------");
                System.out.println("Başka bir işlem yapmak istiyor musunuz? (E/H)");
                String answer5 = myScanner.next();
                if (answer5.equals("E") || answer5.equals("e")) {
                    myAdvancedCalculator();
                } else {
                    System.out.println("Çıkış yapılıyor...");
                }
                break;
            case 6:
                // Square Root
                result = 0;
                System.out.print("Karekökünü almak istediğiniz sayıyı giriniz: ");
                int nSquareRoot = myScanner.nextInt();
                double squareRoot = Math.sqrt(nSquareRoot);
                System.out.println("Karekök " + nSquareRoot + " : " + squareRoot);
                //return to selection
                System.out.println("-----------------------------");
                System.out.println("Başka bir işlem yapmak istiyor musunuz? (E/H)");
                String answer6 = myScanner.next();
                if (answer6.equals("E") || answer6.equals("e")) {
                    myAdvancedCalculator();
                } else {
                    System.out.println("Çıkış yapılıyor...");
                }
                break;
            case 7:
                // Factorial
                result = 0;
                System.out.print("Faktöriyelini almak istediğiniz sayıyı giriniz: ");
                int nFactorial = myScanner.nextInt();
                int factorial = 1;
                for (int i = 1; i <= nFactorial; i++) {
                    factorial *= i;
                }
                System.out.println("Faktöriyel " + nFactorial + " : " + factorial);
                //return to selection
                System.out.println("-----------------------------");
                System.out.println("Başka bir işlem yapmak istiyor musunuz? (E/H)");
                String answer7 = myScanner.next();
                if (answer7.equals("E") || answer7.equals("e")) {
                    myAdvancedCalculator();
                } else {
                    System.out.println("Çıkış yapılıyor...");
                }
                break;
            case 8:
                // Mod
                System.out.print("Modunu almak istediğiniz sayıyı giriniz: ");
                int nMod = myScanner.nextInt();
                System.out.print("Mod'u giriniz: ");
                int nMod2 = myScanner.nextInt();
                int mod = nMod % nMod2;
                System.out.println("Mod " + nMod + " : " + mod);
                //return to selection
                System.out.println("-----------------------------");
                System.out.println("Başka bir işlem yapmak istiyor musunuz? (E/H)");
                String answer8 = myScanner.next();
                if (answer8.equals("E") || answer8.equals("e")) {
                    myAdvancedCalculator();
                } else {
                    System.out.println("Çıkış yapılıyor...");
                }
                break;
            case 9:
                // Rectangle Area and Perimeter
                System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
                int nRectangle = myScanner.nextInt();
                System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
                int nRectangle2 = myScanner.nextInt();
                int rectangleArea = nRectangle * nRectangle2;
                int rectanglePerimeter = 2 * (nRectangle + nRectangle2);
                System.out.println("Dikdörtgenin Alanı: " + rectangleArea);
                System.out.println("Dikdörtgenin Çevresi: " + rectanglePerimeter);
                //return to selection
                System.out.println("-----------------------------");
                System.out.println("Başka bir işlem yapmak istiyor musunuz? (E/H)");
                String answer9 = myScanner.next();
                if (answer9.equals("E") || answer9.equals("e")) {
                    myAdvancedCalculator();
                } else {
                    System.out.println("Çıkış yapılıyor...");
                }
                break;
            default:
                System.out.println("Hatalı seçim yaptınız!");

                //return to selection
                System.out.println("-----------------------------");
                System.out.println("Başka bir işlem yapmak istiyor musunuz? (E/H)");
                String answerDefault = myScanner.next();
                if (answerDefault.equals("E") || answerDefault.equals("e")) {
                    myAdvancedCalculator();
                } else {
                    System.out.println("Program sonlandırılıyor...");
                }
                break;


        }
    }
}