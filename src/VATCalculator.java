import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class VATCalculator {

    public static void myVATCalculator(){
        double tl, kdvA = 0.18, kdvB = 0.08, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Tutar giriniz     : ");
        tl = input.nextDouble();

        double kdvOrani = tl <= 1000 ? kdvA : kdvB;
        String str = "KDV Oranınız   : " + (kdvOrani * 100) + "%";
        System.out.println(str);
        kdvTutar = tl * kdvOrani;
        kdvliTutar =  tl + kdvTutar;

        System.out.println("Ürün fiyatı     : " + tl);
        System.out.println("KDV Oranı       : " + str);
        System.out.println("KDV Tutarı      : " + kdvTutar);
        System.out.println("Toplam          : " + kdvliTutar);
    }
}
