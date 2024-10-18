package Core_Java_Concepts.OOPS.Inheritance.Transport;

public class Vehicle {

    String brand;
    int wheels;

    public void openSunroof() {
        System.out.println(brand + "Opening the sunroof.");
    }
    public void kickStart() {
        System.out.println(brand + " is kicking start.");
    }

    public Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }

    public void start() {
        System.out.println(brand + " is starting.");
    }

    public void stop() {
        System.out.println(brand + " is stopping.");
    }

    public void accelerate() {
        System.out.println(brand + " is accelerating.");
    }

    public void brake() {
        System.out.println(brand + " is braking.");
    }

    public void drive() {
        System.out.println(brand + " is driving.");
    }

    public void honk() {
        System.out.println(brand + " is honking.");
    }

    public void turnLeft() {
        System.out.println(brand + " is turning left.");
    }

    public void turnRight() {
        System.out.println(brand + " is turning right.");
    }

    protected void refuel() {
        System.out.println(brand + " is refueling.");
    }

    protected void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return brand + " has " + wheels + " wheels.";
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        System.out.println("********************************* Bike Details ******************************************");
        Bike.main(args);
        System.out.println("************************************ Car Details *************************************");
        Car.main(args);
        System.out.println("************************************** Truck Details ***********************************");
        Truck.main(args);
    }
}

