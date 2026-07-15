package collections.funcInterface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Assignment7 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(22);
        numbers.add(31);
        numbers.add(48);
        numbers.add(57);
        numbers.add(64);
        numbers.add(73);
        numbers.add(80);
        numbers.add(95);

        Consumer<Integer> checkOddEven = num -> {
            if (num % 2 == 0)
                System.out.println(num + " even");
            else
                System.out.println(num + " odd");
        };

        numbers.forEach(checkOddEven);
    }
}
