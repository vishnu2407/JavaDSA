package Core_Java_Concepts.OOPS.Inheritance.Transport;

public class Truck extends Vehicle {
    public Truck(String brand, int wheels) {
        super(brand, wheels);
    }

    public static void main(String[] args) {

        System.out.println("************************************** Ashok-Leyland Truck Details ***********************************");
        Truck truck1 = new Truck("Ashok-Leyland", 8);
        truck1.brand = "Ashok Leyland";
        truck1.wheels = 8;
        truck1.start();
        truck1.stop();
        truck1.accelerate();
        truck1.brake();
        truck1.drive();
        truck1.honk();
        truck1.turnLeft();
        truck1.turnRight();
        truck1.refuel();
        System.out.println(truck1.hashCode());
        System.out.println(truck1);
    }
}
