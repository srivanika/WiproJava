package Arrays.miniProject1.oops.encapsulation.inheritance.overriding;

public class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Triangle");
    }
}