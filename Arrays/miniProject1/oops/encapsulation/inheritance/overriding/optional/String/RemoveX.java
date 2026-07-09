package Arrays.miniProject1.oops.encapsulation.inheritance.overriding.optional.String;

public class RemoveX {

    public static String removeX(String str) {

        if (str.startsWith("x")) {
            str = str.substring(1);
        }

        if (str.endsWith("x")) {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }

    public static void main(String[] args) {

        System.out.println(removeX("xHix"));
        System.out.println(removeX("America"));
    }
}