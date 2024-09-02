package OOPS.Inheritance.Shapes.Transport;

public class Bike extends Vehicle {

    public Bike(String brand, int wheels, String model) {
        super(brand, wheels);
    }

    public static void main(String[] args) {
        Bike bike1 = new Bike("Honda", 2, "Glamour");
        bike1.brand = "Honda Glamour";
        bike1.kickStart();
        bike1.drive();
        bike1.stop();
        bike1.refuel();
        bike1.honk();
        bike1.turnLeft();
        bike1.turnRight();
        bike1.accelerate();
        bike1.brake();
        System.out.println(bike1.hashCode());
        System.out.println(bike1);

        System.out.println("*************************************************************************");

        Bike bike2 = new Bike("Jawa", 2, "42 Bobber");
        bike2.brand = "Jawa 42 Bobber";
        bike2.kickStart();
        bike2.drive();
        bike2.stop();
        bike2.refuel();
        bike2.honk();
        bike2.turnLeft();
        bike2.turnRight();
        bike2.accelerate();
        bike2.brake();
        System.out.println(bike2.hashCode());
        System.out.println(bike2);

        System.out.println("*************************************************************************");

        Bike bike3 = new Bike("Harley Davidson", 2, "Sportster S");
        bike3.brand = "Harley Davidson Sportster S";
        bike3.kickStart();
        bike3.drive();
        bike3.stop();
        bike3.refuel();
        bike3.honk();
        bike3.turnLeft();
        bike3.turnRight();
        bike3.accelerate();
        bike3.brake();
        System.out.println(bike3.hashCode());
        System.out.println(bike3);
    }
}
