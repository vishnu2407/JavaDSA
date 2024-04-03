package OOPS.Inheritance.Shapes.ThreeD;

public class Cylinder {

    double radius;
    double height;
    double width;

    public Cylinder(double radius, double height, double width) {
        this.radius = radius;
        this.height = height;
        this.width = width;
    }

    public double Area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double Volume() {
        return Math.PI * radius * radius * height;
    }

    public String toString() {
        return "Cylinder [radius=" + radius + ", height=" + height + ", width=" + width + "]";
    }


}
