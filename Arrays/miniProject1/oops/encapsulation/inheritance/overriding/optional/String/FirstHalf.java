package Arrays.miniProject1.oops.encapsulation.inheritance.overriding.optional.String;

public class FirstHalf {

    public static String getFirstHalf(String str) {

        if (str.length() % 2 == 0) {
            return str.substring(0, str.length() / 2);
        }

        return null;
    }

    public static void main(String[] args) {

        System.out.println(getFirstHalf("TomCat"));
        System.out.println(getFirstHalf("Apron"));
    }
}