package Core_Java_Concepts.OOPS.Inheritance.Shapes.ThreeD;

public class Cube {
    double base;
    public Cube(double side) {
        this.base = side;
    }


    public double Area() {
        return 6 * base * base;
    }
    public double Volume() {
        return base * base * base;
    }
    public String toString() {
        return "Cube [side=" + base + "]";
    }
}
