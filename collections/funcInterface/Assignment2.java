package collections.funcInterface;

import java.util.ArrayList;
import java.util.function.Function;

public class Assignment2 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);

        Function<ArrayList<Integer>, Integer> sum = list -> {
            int total = 0;
            for (int n : list)
                total += n;
            return total;
        };

        System.out.println("Sum = " + sum.apply(numbers));
    }
}
