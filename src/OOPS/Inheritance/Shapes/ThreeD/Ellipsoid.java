package OOPS.Inheritance.Shapes.ThreeD;

public class Ellipsoid {
    double radius1;
    double radius2;
    double radius3;
    public Ellipsoid(double radius1, double radius2, double radius3) {
        this.radius1 = radius1;
        this.radius2 = radius2;
        this.radius3 = radius3;
    }

    public double area() {
        return 4 * Math.PI * radius1 * radius2 * radius3;
    }

    public double volume() {
        return (4 / 3) * Math.PI * radius1 * radius2 * radius3;
    }

    public String Area() {
        return "Area of Ellipsoid: " + area();
    }

    public String Volume() {
        return "Volume of Ellipsoid: " + volume();
    }

    public String toString() {
        return "Ellipsoid: " + radius1 + ", " + radius2 + ", " + radius3;
    }


}
