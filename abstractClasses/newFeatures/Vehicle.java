package abstractClasses.newFeatures;

public interface Vehicle {

    default void message() {
        System.out.println("Inside Vehicle");
    }
}