package Arrays.miniProject1.oops.encapsulation.inheritance.overriding.optional.String.StringJoiner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class String1 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(
                Arrays.asList("Alice", "Bob", "Charlie", "David"));

        StringJoiner joiner = new StringJoiner(", ", "{", "}");

        names.forEach(name -> joiner.add(name));

        System.out.println("Result: " + joiner.toString());
    }
}