package OOPS.Inheritance.Shapes.TwoD;

public class Trapezoid {
    double base1;
    double base2;
    double height;
    double side1;
    double side2;
    public Trapezoid(double base1, double base2, double height, double side1) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }
    public double area() {
        return ((base1 + base2) / 2) * height;
    }
    public double perimeter() {
        return base1 + base2 + side1 + side2;
    }
    public String Area() {
        return "Area of Trapezoid: " + area();
    }
    public String Perimeter() {
        return "Perimeter of Trapezoid: " + perimeter();
    }

    public String toString() {
        return "Trapezoid: " + base1 + " " + base2 + " " + height + " " + side1 + " " + side2;
    }
}
