package Arrays.miniProject1.oops.encapsulation.inheritance.overriding;

public class Apple extends Fruit {

    // Constructor
    public Apple() {
        super("Apple", "Sweet", "Medium");
    }

    // Overriding eat() method
    @Override
    public void eat() {
        System.out.println("Apple tastes Sweet.");
    }

    public static void main(String[] args) {

        Fruit apple = new Apple();
        Fruit orange = new Orange();

        apple.eat();
        orange.eat();
    }
}