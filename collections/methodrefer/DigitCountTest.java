package collections.methodrefer;

public class DigitCountTest {

    public static void main(String[] args) {

        DigitCountInterface dc = DigitCounter::digitCount;

        System.out.println("Digits = " + dc.count(987654));

    }

}
