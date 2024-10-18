package Core_Java_Concepts.OOPS.Inheritance.Shapes.ThreeD;

public class Torus {
    double radius;
    double height;
    public Torus(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    public String toString() {
        return "Torus: radius = " + radius + ", height = " + height;
    }

    public String Area() {
        return "Area of torus: " + area();
    }

    public String Volume() {
        return "Volume of torus: " + volume();
    }
}
