package Arrays.miniProject1.oops.encapsulation.inheritance.overriding;

public class Orange extends Fruit {

    public Orange() {
        super("Orange", "Sour", "Medium");
    }

    @Override
    public void eat() {
        System.out.println("Orange tastes Sour.");
    }
}