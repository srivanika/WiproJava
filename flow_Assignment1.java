public class flow_Assignment1 {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);

        if (num > 0) {
            System.out.println(num + " is Positive");
        } else if (num < 0) {
            System.out.println(num + " is Negative");
        } else {
            System.out.println(num + " is Zero");
        }
    }
}