package OOPS.Inheritance.Shapes;

public class Square extends Shape {

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double Area() {
        return side * side;
    }

    @Override
    public double Perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square [side=" + side + "]";
    }

    public static void main(String[] args) {
        Square square = new Square(10);
        System.out.println("Area of Square: " + square.Area());
        System.out.println("Perimeter of Square: " + square.Perimeter());
        System.out.println(square);
    }
}
