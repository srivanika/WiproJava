public class flow_Assignment17 {
     public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        System.out.println(reverse);
    }
}
