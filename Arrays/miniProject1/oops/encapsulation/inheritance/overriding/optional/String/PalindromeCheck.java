package Arrays.miniProject1.oops.encapsulation.inheritance.overriding.optional.String;

public class PalindromeCheck {

    public static boolean isPalindrome(String str) {

        if (str == null) {
            return false;
        }

        StringBuffer sb = new StringBuffer(str);
        String reversed = sb.reverse().toString();

        return str.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {

        String input = "Radar";

        if (isPalindrome(input)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is not a Palindrome");
        }
    }
}