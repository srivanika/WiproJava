package Arrays.miniProject1.oops.encapsulation.inheritance.overriding.optional.String;

public class CombineStrings {

    public static String combine(String a, String b) {

        String result = "";

        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {
            result = result + a.charAt(i) + b.charAt(i);
        }

        if (a.length() > b.length()) {
            result = result + a.substring(min);
        } else {
            result = result + b.substring(min);
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(combine("Hello", "World"));
    }
}