package collections.lambdaexp;

import java.util.ArrayList;

public class OddLengthWordsLambda {

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

        System.out.println("Words with Odd Length:");

        al.forEach(word -> {

            if (word.length() % 2 != 0) {
                System.out.println(word);
            }

        });

    }

}
