package abstractClasses.Packages.automobile;

import abstractClasses.Packages.twowheeler.Hero;
import abstractClasses.Packages.twowheeler.Honda;
import abstractClasses.Packages.fourwheeler.Logan;
import abstractClasses.Packages.fourwheeler.Ford;

public class TestVehicle {

    public static void main(String[] args) {

        Hero hero = new Hero();
        System.out.println("----- HERO -----");
        System.out.println("Model Name: " + hero.getModelName());
        System.out.println("Registration Number: " + hero.getRegistrationNumber());
        System.out.println("Owner Name: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed());
        hero.radio();

        System.out.println();

        Honda honda = new Honda();
        System.out.println("----- HONDA -----");
        System.out.println("Model Name: " + honda.getModelName());
        System.out.println("Registration Number: " + honda.getRegistrationNumber());
        System.out.println("Owner Name: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed());
        honda.cdplayer();

        System.out.println();

        Logan logan = new Logan();
        System.out.println("----- LOGAN -----");
        System.out.println("Model Name: " + logan.getModelName());
        System.out.println("Registration Number: " + logan.getRegistrationNumber());
        System.out.println("Owner Name: " + logan.getOwnerName());
        System.out.println("Speed: " + logan.speed());
        logan.gps();

        System.out.println();

        Ford ford = new Ford();
        System.out.println("----- FORD -----");
        System.out.println("Model Name: " + ford.getModelName());
        System.out.println("Registration Number: " + ford.getRegistrationNumber());
        System.out.println("Owner Name: " + ford.getOwnerName());
        System.out.println("Speed: " + ford.speed());
        ford.tempControl();
    }
}