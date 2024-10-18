package Core_Java_Concepts.OOPS.Inheritance.Shapes.TwoD;

public class Circle {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double Area() {
        return Math.PI * radius * radius;
    }

    public double Perimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle [radius=" + radius + "]";
    }


}
