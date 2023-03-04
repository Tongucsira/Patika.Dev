import java.util.Scanner;

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
        if (number == reverse) {
            System.out.println(number + " is a palindrome.");
            return true;
        } else {
            System.out.println(number + " is not a palindrome.");
            return false;
        }
    }
    public static void myPalindromeChecker() {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a palindrome: ");
        int number = myScanner.nextInt();
        System.out.println(isPalindrome(number));
    }
}
