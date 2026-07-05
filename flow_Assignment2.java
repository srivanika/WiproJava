public class flow_Assignment2 {
     public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        if (num1 % 10 == num2 % 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
