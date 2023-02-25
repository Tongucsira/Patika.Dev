import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class GroceryStore {

    public static void myGroceryStore() {

        //Değişkenleri oluştur.

        Scanner input = new Scanner(System.in);
        double armutKgFiyat = 2.14;
        double elmaKgFiyat = 3.67;
        double domatesKgFiyat = 1.11;
        double muzKgFiyat = 0.95;
        double patlicanKgFiyat = 5.00;
        double toplamTutar = 0.0;

        //Kullanıcıdan alınan değerleri değişkenlere ata.

        System.out.println("Manavdan aldığınız ürünleri ve kilogramlarını giriniz:");
        System.out.print("Armut (kg): ");
        double armutKg = input.nextDouble();
        toplamTutar += armutKg * armutKgFiyat;

        System.out.print("Elma (kg): ");
        double elmaKg = input.nextDouble();
        toplamTutar += elmaKg * elmaKgFiyat;

        System.out.print("Domates (kg): ");
        double domatesKg = input.nextDouble();
        toplamTutar += domatesKg * domatesKgFiyat;

        System.out.print("Muz (kg): ");
        double muzKg = input.nextDouble();
        toplamTutar += muzKg * muzKgFiyat;

        System.out.print("Patlıcan (kg): ");
        double patlicanKg = input.nextDouble();
        toplamTutar += patlicanKg * patlicanKgFiyat;

        //Sonuçları ekrana yazdır.

        System.out.printf("Toplam Tutar: %.2f TL", toplamTutar);
    }
}
