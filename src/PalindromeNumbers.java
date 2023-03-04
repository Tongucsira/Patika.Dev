/**
 * @author Tonguç Şira
 */
public class PalindromeNumbers {

    static boolean isPalindrome (int number) {

        int temp = number, reverse = 0, lastDigit;
        while (temp != 0) {
            lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp /= 10;
        }
        if (number == reverse)
            return true;
        else
            return false;
    }
    public static void nmb() {
        int number = 101;
        System.out.println(isPalindrome(number));
    }
}
