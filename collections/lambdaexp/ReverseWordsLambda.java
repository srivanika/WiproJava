package collections.lambdaexp;

import java.util.ArrayList;

public class ReverseWordsLambda {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Java");
        al.add("Python");
        al.add("Oracle");
        al.add("Spring");
        al.add("HTML");
        al.add("CSS");
        al.add("JavaScript");
        al.add("React");
        al.add("Angular");
        al.add("MySQL");

        System.out.println("Words in Reverse:");

        al.forEach(word -> {

            String reverse = new StringBuilder(word).reverse().toString();

            System.out.println(reverse);

        });

    }

}
