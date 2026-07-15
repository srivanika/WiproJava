package collections.funcInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Assignment5 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(7);
        numbers.add(9);
        numbers.add(12);
        numbers.add(16);
        numbers.add(18);
        numbers.add(25);
        numbers.add(36);
        numbers.add(50);
        numbers.add(64);

        Predicate<Integer> perfectSquare = num -> {
            int sqrt = (int) Math.sqrt(num);
            return sqrt * sqrt == num;
        };

        System.out.println("Perfect Square Numbers:");

        numbers.stream()
                .filter(perfectSquare)
                .forEach(System.out::println);
    }
}
