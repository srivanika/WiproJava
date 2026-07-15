package collections.funcInterface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Assignment6 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Java");
        words.add("Python");
        words.add("Apple");
        words.add("Orange");
        words.add("Computer");
        words.add("Keyboard");
        words.add("Mouse");
        words.add("Monitor");
        words.add("Laptop");
        words.add("Mobile");

        Consumer<ArrayList<String>> reverseWords = list -> {
            for (int i = 0; i < list.size(); i++) {
                String rev = new StringBuilder(list.get(i)).reverse().toString();
                list.set(i, rev);
            }
        };

        reverseWords.accept(words);

        System.out.println("Reversed Words:");

        words.forEach(System.out::println);
    }
}
