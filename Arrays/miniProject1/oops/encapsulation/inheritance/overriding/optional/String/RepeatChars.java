package Arrays.miniProject1.oops.encapsulation.inheritance.overriding.optional.String;

public class RepeatChars {

    public static String repeatFirstTwo(String str) {

        int n = str.length();

        String firstTwo;

        if (n < 2) {
            firstTwo = str;
        } else {
            firstTwo = str.substring(0, 2);
        }

        String result = "";

        for (int i = 0; i < n; i++) {
            result += firstTwo;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(repeatFirstTwo("Wipro"));
    }
}