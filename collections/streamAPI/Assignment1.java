package collections.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(-10);
        numbers.add(15);
        numbers.add(-8);
        numbers.add(20);
        numbers.add(-5);
        numbers.add(-12);
        numbers.add(18);
        numbers.add(-14);

        List<Integer> negativeEven = numbers.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Negative Even Numbers:");
        negativeEven.forEach(System.out::println);
    }
}
