package OOPS.Inheritance.Shapes.TwoD;

public class Parallelogram {
    double base;
    double height;
    public Parallelogram(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double Area() {
        return base * height;
    }
    public double Perimeter() {
        return 2 * (base + height);
    }
    public String toString() {
        return "Parallelogram [base=" + base + ", height=" + height + "]";
    }

}
