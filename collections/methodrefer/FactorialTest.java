package collections.methodrefer;

public class FactorialTest {

    public static void main(String[] args) {

        Factorial obj = new Factorial();

        FactorialInterface fi = obj::factorial;

        int result = fi.calculate(5);

        System.out.println("Factorial = " + result);

    }
}
