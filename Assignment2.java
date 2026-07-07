public class Assignment2 {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Please pass one command line argument");
            return;
        }

        System.out.println("Welcome " + args[0]);
    }
}