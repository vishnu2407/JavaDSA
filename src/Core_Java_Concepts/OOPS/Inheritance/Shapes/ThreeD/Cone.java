package Core_Java_Concepts.OOPS.Inheritance.Shapes.ThreeD;

public class Cone {
    double radius;
    double height;
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double Area() {
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

    public double Volume() {
        return Math.PI * radius * radius * height / 3;
    }

    public String toString() {
        return "Cone [radius=" + radius + ", height=" + height + "]";
    }
}
