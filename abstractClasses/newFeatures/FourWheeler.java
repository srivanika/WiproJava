package abstractClasses.newFeatures;

public interface FourWheeler {

    default void message() {
        System.out.println("Inside FourWheeler");
    }
}