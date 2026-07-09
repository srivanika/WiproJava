package Arrays.miniProject1.oops.encapsulation.inheritance.overriding.optional.String;

public class RemoveStar {

    public static String removeStar(String str) {

        int index = str.indexOf('*');

        if (index == -1) {
            return str;
        }

        String left = "";
        String right = "";

        if (index > 1) {
            left = str.substring(0, index - 1);
        }

        if (index < str.length() - 2) {
            right = str.substring(index + 2);
        }

        return left + right;
    }

    public static void main(String[] args) {

        System.out.println(removeStar("ab*cd"));
    }
}