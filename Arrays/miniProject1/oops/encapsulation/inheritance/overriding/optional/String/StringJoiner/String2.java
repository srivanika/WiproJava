package Arrays.miniProject1.oops.encapsulation.inheritance.overriding.optional.String.StringJoiner;

import java.util.StringJoiner;

public class String2 {

    public static void main(String[] args) {

        StringJoiner s1 = new StringJoiner("-");
        s1.add("New York");
        s1.add("London");
        s1.add("Tokyo");

        StringJoiner s2 = new StringJoiner("-");
        s2.add("Paris");
        s2.add("Berlin");
        s2.add("Mumbai");

        System.out.println("Original s1: " + s1);
        System.out.println("Original s2: " + s2);

        // s1 merged to s2
        StringJoiner merge1 = new StringJoiner("-");
        merge1.add("Paris");
        merge1.add("Berlin");
        merge1.add("Mumbai");
        merge1.merge(s1);

        System.out.println("s1 merged to s2: " + merge1);

        // s2 merged to s1
        StringJoiner merge2 = new StringJoiner("-");
        merge2.add("New York");
        merge2.add("London");
        merge2.add("Tokyo");
        merge2.merge(s2);

        System.out.println("s2 merged to s1: " + merge2);
    }
}