package Arrays.miniProject1.oops.encapsulation.inheritance;

public class Bird extends Animal {

    @Override
    public void eat() {
        System.out.println("Bird is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping.");
    }

    public void fly() {
        System.out.println("Bird is flying.");
    }

    public static void main(String[] args) {

        Animal animal = new Animal();

        System.out.println("Animal Class:");
        animal.eat();
        animal.sleep();

        System.out.println();

        Bird bird = new Bird();

        System.out.println("Bird Class:");
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}