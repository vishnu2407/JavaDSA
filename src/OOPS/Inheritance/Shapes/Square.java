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

}
