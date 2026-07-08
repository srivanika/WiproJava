package Arrays.miniProject1.oops.encapsulation.inheritance.overriding;

public class ShapeDemo {

    public static void main(String[] args) {

        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();

        c.draw();
        c.erase();

        System.out.println();

        t.draw();
        t.erase();

        System.out.println();

        s.draw();
        s.erase();
    }
}