package OOPS.Inheritance.Shapes.TwoD;

public class Parabola {
    double height;
    double vertex;
    public Parabola(double height, double vertex) {
        this.height = height;
        this.vertex = vertex;
    }
    double area() {
        return 2 * height * vertex;
    }
    double perimeter() {
        return 4 * vertex;
    }
    public String Area() {
        return "Area of Parabola: " + area();
    }
    public String Perimeter() {
        return "Perimeter of Parabola: " + perimeter();
    }
}
