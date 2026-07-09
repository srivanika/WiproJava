package Arrays.miniProject1.oops.encapsulation.inheritance.overriding.optional;

import java.util.Optional;

public class Optional2 {

    public static void main(String[] args) {

        String address = null;

        String result = Optional.ofNullable(address).orElse("India");

        System.out.println("Address: " + result);
    }
}