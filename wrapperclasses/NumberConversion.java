package wrapperclasses;

public class NumberConversion {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide an integer as a command-line argument.");
            System.out.println("Example: java NumberConversion 20");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);

            System.out.println("Given Number :" + number);
            System.out.println("Binary equivalent :" + Integer.toBinaryString(number));
            System.out.println("Octal equivalent :" + Integer.toOctalString(number));
            System.out.println("Hexadecimal equivalent :" + Integer.toHexString(number));

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}