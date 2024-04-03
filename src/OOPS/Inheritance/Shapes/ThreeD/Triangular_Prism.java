package OOPS.Inheritance.Shapes.ThreeD;

public class Triangular_Prism {
    double base;
    double height;
    double depth;
    public Triangular_Prism(double base, double height, double depth) {
        this.base = base;
        this.height = height;
        this.depth = depth;
    }

    public double Area() {
        return 2 * base * height + 2 * base * depth + 2 * depth * height;
    }

    public double Volume() {
        return base * height * depth;
    }

    public String toString() {
        return "Triangular_Prism [base=" + base + ", height=" + height + ", depth=" + depth + "]";
    }

}
