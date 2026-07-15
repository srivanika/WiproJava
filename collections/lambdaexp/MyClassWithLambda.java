package collections.lambdaexp;

public class MyClassWithLambda {

    public static void main(String[] args) {

        WordCount wc = (str) -> {

            if (str == null || str.trim().isEmpty())
                return 0;

            return str.trim().split("\\s+").length;

        };

        String sentence = "Java is an object oriented programming language";

        System.out.println("Sentence:");
        System.out.println(sentence);

        System.out.println("\nWord Count = " + wc.count(sentence));

    }

}
