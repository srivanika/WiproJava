package Arrays.miniProject1.oops.encapsulation.inheritance.overriding.optional;

import java.util.Optional;

public class Optional1 {

    public static void main(String[] args) {

        String[] names = new String[5];

        Optional<String> optionalName = Optional.ofNullable(names[0]);

        if (optionalName.isPresent()) {
            System.out.println("Length = " + optionalName.get().length());
        } else {
            System.out.println("Name is null");
        }
    }
}