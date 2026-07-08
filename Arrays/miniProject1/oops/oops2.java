package Arrays.miniProject1.oops;

public class oops2 {

    // Static method to calculate power of integers
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Static method to calculate power of double
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {

        int intResult = powerInt(5, 3);
        double doubleResult = powerDouble(2.5, 3);

        System.out.println("Power of Integer: " + intResult);
        System.out.println("Power of Double: " + doubleResult);
    }
}