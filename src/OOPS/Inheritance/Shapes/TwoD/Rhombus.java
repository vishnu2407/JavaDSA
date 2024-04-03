package OOPS.Inheritance.Shapes.TwoD;

public class Rhombus {

    double side;
    public Rhombus(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4 * side;
    }

    public String toString() {
        return "Rhombus: " + Area() + " " + Perimeter();
    }

    public String Area() {
        return "Area of Rhombus: " + area();
    }

    public String Perimeter() {
        return "Perimeter of Rhombus: " + perimeter();
    }
}
