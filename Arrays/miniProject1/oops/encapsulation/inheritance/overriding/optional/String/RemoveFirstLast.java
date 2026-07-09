package Arrays.miniProject1.oops.encapsulation.inheritance.overriding.optional.String;

public class RemoveFirstLast {

    public static String removeFirstLast(String str) {

        if (str.length() <= 2) {
            return "";
        }

        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {

        String input = "Suman";

        System.out.println(removeFirstLast(input));
    }
}