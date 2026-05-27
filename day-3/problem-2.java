// find palindrome only using recursion
// input: madam  | java
// output: true  | false
import java.util.Scanner;
class Main {
    static boolean palindrome(String s, int start, int end) {

        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return palindrome(s, start + 1, end - 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (palindrome(s, 0, s.length() - 1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
