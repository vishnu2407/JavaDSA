package OOPS.Inheritance.Shapes.ThreeD;

public class Sphere {

    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double Area() {
        return 4 * Math.PI * radius * radius;
    }

    public double Volume() {
        return ((double) 4 / 3) * Math.PI * radius * radius * radius;
    }

    public String toString() {
        return "Sphere [radius=" + radius + "]";
    }

}
