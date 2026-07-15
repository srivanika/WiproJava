package collections.funcInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Assignment3 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("madam");
        words.add("apple");
        words.add("level");
        words.add("java");
        words.add("radar");
        words.add("book");
        words.add("noon");
        words.add("computer");
        words.add("racecar");
        words.add("pen");

        Predicate<String> palindrome = word ->
                word.equals(new StringBuilder(word).reverse().toString());

        System.out.println("Palindrome Words:");

        words.stream()
                .filter(palindrome)
                .forEach(System.out::println);
    }
}
