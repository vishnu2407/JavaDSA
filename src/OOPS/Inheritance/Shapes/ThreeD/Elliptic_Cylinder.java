package OOPS.Inheritance.Shapes.ThreeD;

public class Elliptic_Cylinder {
    double radius;
    double height;
    public Elliptic_Cylinder(double radius, double height, int i) {
        this.radius = radius;
        this.height = height;
    }
    public double area() {
        return Math.PI * radius * radius * height;
    }
    public double volume() {
        return Math.PI * radius * radius * height;
    }
    public String Area() {
        return "Area of Elliptic Cylinder: " + area();
    }
    public String Volume() {
        return "Volume of Elliptic Cylinder: " + volume();
    }
    public String toString() {
        return "Radius: " + radius + " Height: " + height;
    }

}
