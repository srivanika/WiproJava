package Arrays.miniProject1.oops.encapsulation.inheritance.overriding.optional.String;

public class RepeatLastN {

    public static String repeat(String str, int n) {

        String last = str.substring(str.length() - n);

        String result = "";

        for (int i = 0; i < n; i++) {
            result = result + last;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(repeat("Wipro", 3));
    }
}