package Core_Java_Concepts.OOPS.Inheritance.Shapes.TwoD;

public class Pentagon {
    double side;

    public Pentagon(double side) {
        this.side = side;
    }

    double area() {
        return (5 * side * side) / (4 * Math.tan(3.14 / 5));
    }

    double perimeter() {
        return 5 * side;
    }

    public String Area() {
        return "Area of Pentagon: " + area();

    }

    public String Perimeter() {
        return "Perimeter of Pentagon: " + perimeter();
    }

    public String toString() {
        return "Pentagon: " + Area() + " " + Perimeter();
    }
}
