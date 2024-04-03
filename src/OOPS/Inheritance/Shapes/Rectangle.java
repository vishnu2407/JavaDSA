package OOPS.Inheritance.Shapes;

public class Rectangle extends Shape {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double Area() {
        return length * breadth;
    }

    @Override
    public double Perimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Area of Rectangle: " + rectangle.Area());
        System.out.println("Perimeter of Rectangle: " + rectangle.Perimeter());
        System.out.println(rectangle);
    }

}
