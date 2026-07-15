package collections.methodrefer;

public class PrimeChecker {

    public PrimeChecker(int n) {

        if (isPrime(n))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");

    }

    private boolean isPrime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0)
                return false;

        }

        return true;
    }

}
