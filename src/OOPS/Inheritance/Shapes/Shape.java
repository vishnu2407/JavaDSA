package OOPS.Inheritance.Shapes;

public abstract class Shape {
    public abstract double Area();

    public abstract double Perimeter();

    public abstract String toString();

    public static void main(String[] args) {

        // Square Square = new Square(10);
        Square square = new Square(10);
        System.out.println("Square: ");
        System.out.println("Area of Square: " + square.Area());
        System.out.println("Perimeter of Square: " + square.Perimeter());
        System.out.println(square);

        System.out.println("*****************************************");

        // Rectangle Rectangle = new Rectangle(10, 20);
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Rectangle: ");
        System.out.println("Area of Rectangle: " + rectangle.Area());
        System.out.println("Perimeter of Rectangle: " + rectangle.Perimeter());
        System.out.println(rectangle);

        System.out.println("*****************************************");

        // Circle circle = new Circle(10);
        Circle circle = new Circle(10);
        System.out.println("Circle: ");
        System.out.println("Area of Circle: " + circle.Area());
        System.out.println("Perimeter of Circle: " + circle.Perimeter());
        System.out.println(circle);

        System.out.println("*****************************************");

        // Parallelogram parallelogram = new Parallelogram(10, 20);
        Parallelogram parallelogram = new Parallelogram(10, 20);
        System.out.println("Parallelogram: ");
        System.out.println("Area of Parallelogram: " + parallelogram.Area());
        System.out.println("Perimeter of Parallelogram: " + parallelogram.Perimeter());
        System.out.println(parallelogram);

        System.out.println("*****************************************");

        // Cylinder cylinder = new Cylinder(10, 20, 30);
        Cylinder cylinder = new Cylinder(10, 20, 30);
        System.out.println("Cylinder: ");
        System.out.println("Area of Cylinder: " + cylinder.Area());
        System.out.println("Volume of Cylinder: " + cylinder.Volume());
        System.out.println(cylinder);

        System.out.println("*****************************************");

        // Triangle triangle = new Triangle(10, 20, 30);
        Triangle triangle = new Triangle(10, 20, 30);
        System.out.println("Triangle: ");
        System.out.println("Area of Triangle: " + triangle.Area());
        System.out.println("Perimeter of Triangle: " + triangle.Perimeter());
        System.out.println(triangle);
    }
}
