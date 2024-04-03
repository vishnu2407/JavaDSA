package OOPS.Inheritance.Shapes.TwoD;

public class Triangle {
    double base;
    double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double Area() {
        return 0.5 * base * height;
    }

    public double Perimeter() {
        return 3 * base;
    }

    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + "]";
    }

}
