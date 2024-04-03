package OOPS.Inheritance.Shapes.TwoD;

public class Hexagon {
    double side;

    public Hexagon(double side) {
        this.side = side;
    }

    public double area() {
        return (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;
    }

    public double perimeter() {
        return 6 * side;
    }

    public String Area() {
        return "Area of Hexagon: " + area();
    }
    public String Perimeter() {
        return "Perimeter of Hexagon: " + perimeter();
    }
    public String toString() {
        return "Hexagon: " + Area() + " " + Perimeter();
    }
}
