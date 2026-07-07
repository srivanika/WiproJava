public class flow_Assignment8 {
     public static void main(String[] args) {

        char ch = 'a';

        if (Character.isLowerCase(ch)) {
            System.out.println(ch + "->" + Character.toUpperCase(ch));
        } else if (Character.isUpperCase(ch)) {
            System.out.println(ch + "->" + Character.toLowerCase(ch));
        }
    }
}
