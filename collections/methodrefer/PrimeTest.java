package collections.methodrefer;

public class PrimeTest {

    public static void main(String[] args) {

        PrimeInterface pi = PrimeChecker::new;

        pi.create(29);

        pi.create(20);

    }

}
