package Arrays.miniProject1.oops.encapsulation.inheritance.overriding;

public class Fruit {

    protected String name;
    protected String taste;
    protected String size;

    // Parameterized Constructor
    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println(name + " tastes " + taste);
    }
}