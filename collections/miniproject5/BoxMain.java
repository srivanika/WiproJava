package collections.miniproject5;
    import java.util.HashSet;
import java.util.Scanner;

public class BoxMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<Box> set = new HashSet<>();

        System.out.println("Enter the number of Box");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter the Box " + i + " details");

            System.out.println("Enter Length");
            double length = sc.nextDouble();

            System.out.println("Enter Width");
            double width = sc.nextDouble();

            System.out.println("Enter Height");
            double height = sc.nextDouble();

            Box box = new Box(length, width, height);

            set.add(box);
        }

        System.out.println("Unique Boxes in the Set are");

        for (Box b : set) {

            System.out.println("Length =" + b.getLength()
                    + " Width =" + b.getWidth()
                    + " Height =" + b.getHeight()
                    + " Volume =" + String.format("%.2f", b.getVolume()));
        }

        sc.close();
    }
}

