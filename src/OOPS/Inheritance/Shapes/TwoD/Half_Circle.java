package OOPS.Inheritance.Shapes.TwoD;

public class Half_Circle {
    double radius;

    public Half_Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public String Area() {
        return String.format("%.2f", area());
    }

    public String Circumference() {
        return String.format("%.2f", circumference());
    }

    public String toString() {
        return "Half_Circle: " + Area() + " " + Circumference();
    }
}
