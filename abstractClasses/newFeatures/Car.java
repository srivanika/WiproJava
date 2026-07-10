package abstractClasses.newFeatures;

public class Car implements Vehicle, FourWheeler {

    @Override
    public void message() {
        Vehicle.super.message();
    }
}