package OOPS.Inheritance.Shapes.ThreeD;

public class Cuboid {
    double length;
    double width;
    double height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double area() {
        return 2 * (length * width + length * height + width * height);
    }

    public double volume() {
        return length * width * height;
    }

    public String toString() {
        return "Cuboid: " + Area() + " " + Volume();
    }

    public String Area() {
        return "Area of Cuboid: " + area();
    }

    public String Volume() {
        return "Volume of Cuboid: " + volume();
    }
}
