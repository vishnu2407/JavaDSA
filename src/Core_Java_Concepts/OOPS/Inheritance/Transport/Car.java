package Core_Java_Concepts.OOPS.Inheritance.Transport;

public class Car extends Vehicle {
   int doors;

    public Car(String brand, int wheels, int doors) {
        super(brand, wheels);
        this.doors = doors;
    }
    public static void main(String[] args) {
        System.out.println("******************************* Tata Cruvv Car Details******************************************");

        Vehicle vehicle1 = new Vehicle("Tata", 4);
        vehicle1.brand = "Cruvv";
        vehicle1.start();
        vehicle1.stop();
        vehicle1.accelerate();
        vehicle1.brake();
        vehicle1.drive();
        vehicle1.honk();
        vehicle1.turnLeft();
        vehicle1.turnRight();
        vehicle1.refuel();
        vehicle1.setWheels(2);
        vehicle1.openSunroof();
        System.out.println(vehicle1.hashCode());
        System.out.println(vehicle1);

        System.out.println("****************************** Mahindra Scorpio Car Details *******************************************");

        Vehicle vehicle2 = new Vehicle("Mahindra", 4);
        vehicle2.brand = "Scorpio";
        vehicle2.start();
        vehicle2.stop();
        vehicle2.accelerate();
        vehicle2.brake();
        vehicle2.drive();
        vehicle2.honk();
        vehicle2.turnLeft();
        vehicle2.turnRight();
        vehicle2.refuel();
        vehicle2.setWheels(2);
        vehicle2.openSunroof();
        System.out.println(vehicle2.hashCode());
        System.out.println(vehicle2);

        System.out.println("****************************** Jaguar XJ6 Car Details *******************************************");

        Vehicle vehicle3 = new Vehicle("Jaguar", 4);
        vehicle3.brand = "XJ6";
        vehicle3.start();
        vehicle3.stop();
        vehicle3.accelerate();
        vehicle3.brake();
        vehicle3.drive();
        vehicle3.honk();
        vehicle3.turnLeft();
        vehicle3.turnRight();
        vehicle3.refuel();
        vehicle3.setWheels(2);
        vehicle3.openSunroof();
        System.out.println(vehicle3.hashCode());
        System.out.println(vehicle3);
    }
}
