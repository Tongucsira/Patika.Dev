import java.util.Scanner;

/**
 * @author Tonguç Şira
 */
public class UserLogin {

    public static void myUserLogin() {

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kullanıcı adı ve şifre bilgilerini alıyoruz.

        String userName, password;
        System.out.print("Kullanıcı Adı: ");

        userName = scanner.nextLine();
        System.out.print("Şifre: ");

        // Kullanıcı adı ve şifre bilgilerini kontrol ediyoruz.

        password = scanner.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Başarılı");
        } else {
            System.out.println("Giriş Başarısız. Bilgilerinizi kontrol ediniz.");
        }
    }
}