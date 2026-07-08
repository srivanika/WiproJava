package Arrays.miniProject1.oops.encapsulation.inheritance.overriding;

public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Circle");
    }
}