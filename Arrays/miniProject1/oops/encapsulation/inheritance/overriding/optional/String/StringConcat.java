package Arrays.miniProject1.oops.encapsulation.inheritance.overriding.optional.String;

public class StringConcat {

    public static String concatStrings(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            return str1 + str2.substring(1);
        }

        return str1 + str2;
    }

    public static void main(String[] args) {

        System.out.println(concatStrings("Sachin", "Tendulkar"));
        System.out.println(concatStrings("Mark", "kate"));
    }
}