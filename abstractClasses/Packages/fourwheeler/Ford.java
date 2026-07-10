package abstractClasses.Packages.fourwheeler;

import abstractClasses.Packages.automobile.Vehicle;

public class Ford extends Vehicle {

    @Override
    public String getModelName() {
        return "Ford EcoSport";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP39GH2222";
    }

    @Override
    public String getOwnerName() {
        return "Srivani";
    }

    public int speed() {
        return 140;
    }

    public int tempControl() {
        System.out.println("Air Conditioner is ON.");
        return 1;
    }
}