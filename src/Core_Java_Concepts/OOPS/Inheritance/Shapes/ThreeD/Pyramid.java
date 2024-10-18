package Core_Java_Concepts.OOPS.Inheritance.Shapes.ThreeD;

public class Pyramid {
    double base;
    double height;
    double side;
    public Pyramid(double base, double height, double side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public double Area() {
        return 0.5 * base * height;
    }

    public double Perimeter() {
        return 4 * side;
    }

    public String toString() {
        return "Pyramid [base=" + base + ", height=" + height + ", side=" + side + "]";
    }
}
