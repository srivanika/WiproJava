package abstractClasses.exceptionHandling;

public class MathOperation {

    public static void main(String[] args) throws ArithmeticException {

        try {

            if (args.length != 5) {
                throw new NumberFormatException();
            }

            int[] numbers = new int[5];

            int sum = 0;

            // Converting command line arguments into integers
            for (int i = 0; i < 5; i++) {

                numbers[i] = Integer.parseInt(args[i]);

                sum = sum + numbers[i];
            }

            double average = sum / 5.0;

            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);

        } 
        catch (NumberFormatException e) {

            System.out.println("java.lang.NumberFormatException");

        } 
        catch (ArithmeticException e) {

            System.out.println("java.lang.ArithmeticException");

        }
    }
}