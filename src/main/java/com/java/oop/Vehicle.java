package com.java.oop;

public class Vehicle {
    String make;
    String model;
    int engineCapacity;
    int numGears;
    String transmissionType;

    // Functions / Methods - Piece of Reusable code
    public void startVehicle() {
        System.out.println("Vehicle "+model+" Started");
    }

    public void stopVehicle() {
        System.out.println("Vehicle "+model+" Stopped!");
    }

    // <ACCESS SPECIFIER> <RETURN TYPE / OUTPUT TYPE> <NAME OF FUNCTION>(...arguments / inputs) {
    // ....
    // ....
    // }
    public int addNumbers(int a, int b) {
        return (a+b);
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle(); // INSTANTIATING AN OBJECT OF TYPE VEHICLE AS CAR
        car.make = "Hyundai";
        car.model = "Creta";
        car.engineCapacity = 1500;
        car.numGears = 6;
        car.transmissionType = "Manual";
        car.startVehicle();
        System.out.println(car.addNumbers(34,23));

        Vehicle tataSafari = new Vehicle();
        tataSafari.make = "Tata";
        tataSafari.model = "Safari";
        tataSafari.engineCapacity = 2200;
        tataSafari.numGears = 6;
        tataSafari.transmissionType = "Automatic";
        tataSafari.startVehicle();
    }
}
