package abstractClasses.Packages.fourwheeler;

import abstractClasses.Packages.automobile.Vehicle;

public class Logan extends Vehicle {

    @Override
    public String getModelName() {
        return "Renault Logan";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP39EF1111";
    }

    @Override
    public String getOwnerName() {
        return "Srivani";
    }

    public int speed() {
        return 120;
    }

    public int gps() {
        System.out.println("GPS is Activated.");
        return 1;
    }
}