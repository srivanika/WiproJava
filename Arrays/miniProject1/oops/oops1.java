package Arrays.miniProject1.oops;

public class oops1 {

    private double width;
    private double height;
    private double depth;

    // Parameterized Constructor
    public oops1(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate volume
    public double getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {

        oops1 box = new oops1(10, 5, 4);

        System.out.println("Width : " + box.width);
        System.out.println("Height : " + box.height);
        System.out.println("Depth : " + box.depth);
        System.out.println("Volume of Box : " + box.getVolume());
    }
}