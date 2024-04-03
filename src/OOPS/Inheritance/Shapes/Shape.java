package OOPS.Inheritance.Shapes;

import OOPS.Inheritance.Shapes.ThreeD.*;
import OOPS.Inheritance.Shapes.TwoD.*;

public abstract class Shape {
    public abstract double Area();

    public abstract double Perimeter();

    public abstract String toString();

    public static void main(String[] args) {

        System.out.println("Output of Two Dimensional Shapes: ");

        // Square Square = new Square(10);
        Square square = new Square(10);
        System.out.println("Square: ");
        System.out.println("Area of Square: " + square.Area());
        System.out.println("Perimeter of Square: " + square.Perimeter());
        System.out.println(square);

        System.out.println(" ");

        // Rectangle Rectangle = new Rectangle(10, 20);
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Rectangle: ");
        System.out.println("Area of Rectangle: " + rectangle.Area());
        System.out.println("Perimeter of Rectangle: " + rectangle.Perimeter());
        System.out.println(rectangle);

        System.out.println(" ");

        // Circle circle = new Circle(10);
        Circle circle = new Circle(10);
        System.out.println("Circle: ");
        System.out.println("Area of Circle: " + circle.Area());
        System.out.println("Perimeter of Circle: " + circle.Perimeter());
        System.out.println(circle);

        System.out.println(" ");

        // Parallelogram parallelogram = new Parallelogram(10, 20);
        Parallelogram parallelogram = new Parallelogram(10, 20);
        System.out.println("Parallelogram: ");
        System.out.println("Area of Parallelogram: " + parallelogram.Area());
        System.out.println("Perimeter of Parallelogram: " + parallelogram.Perimeter());
        System.out.println(parallelogram);

        System.out.println(" ");

        // Triangle triangle = new Triangle(10, 20, 30);
        Triangle triangle = new Triangle(10, 20);
        System.out.println("Triangle: ");
        System.out.println("Area of Triangle: " + triangle.Area());
        System.out.println("Perimeter of Triangle: " + triangle.Perimeter());
        System.out.println(triangle);

        System.out.println("***************************************************");

        System.out.println("Output of Three Dimensional Shapes: ");

        // Cylinder cylinder = new Cylinder(10, 20, 30);
        Cylinder cylinder = new Cylinder(10, 20, 30);
        System.out.println("Cylinder: ");
        System.out.println("Area of Cylinder: " + cylinder.Area());
        System.out.println("Volume of Cylinder: " + cylinder.Volume());
        System.out.println(cylinder);

        System.out.println(" ");

        //Sphere sphere = new Sphere(10);
        Sphere sphere = new Sphere(10);
        System.out.println("Sphere: ");
        System.out.println("Area of Sphere: " + sphere.Area());
        System.out.println("Volume of Sphere: " + sphere.Volume());
        System.out.println(sphere);

        System.out.println(" ");

        // Cube cube = new Cube();
        Cube cube = new Cube(10);
        System.out.println("Cube: ");
        System.out.println("Area of Cube: " + cube.Area());
        System.out.println("Volume of Cube: " + cube.Volume());
        System.out.println(cube);

        System.out.println(" ");

        // Rectangular_Prism rectangular_prism = new Rectangular_Prism(10, 20, 30);
        Rectangular_Prism rectangular_prism = new Rectangular_Prism(10, 20);
        System.out.println("Rectangular_Prism: ");
        System.out.println("Area of Rectangular_Prism: " + rectangular_prism.Area());
        System.out.println("Volume of Rectangular_Prism: " + rectangular_prism.Volume());
        System.out.println(rectangular_prism);

        System.out.println(" ");

        // Triangular_Prism triangular_prism = new Triangular_Prism(10, 20, 30);
        Triangular_Prism triangular_prism = new Triangular_Prism(10, 20, 30);
        System.out.println("Triangular_Prism: ");
        System.out.println("Area of Triangular_Prism: " + triangular_prism.Area());
        System.out.println("Volume of Triangular_Prism: " + triangular_prism.Volume());
        System.out.println(triangular_prism);

        System.out.println(" ");

        // Cone cone = new Cone(10, 20, 30);
        Cone cone = new Cone(10, 20);
        System.out.println("Cone: ");
        System.out.println("Area of Cone: " + cone.Area());
        System.out.println("Volume of Cone: " + cone.Volume());
        System.out.println(cone);

        System.out.println(" ");

        //Pyramid pyramid = new Pyramid(10, 20, 30);
        Pyramid pyramid = new Pyramid(10, 20, 30);
        System.out.println("Pyramid: ");
        System.out.println("Area of Pyramid: " + pyramid.Area());
        System.out.println("Volume of Pyramid: " + pyramid.Perimeter());
        System.out.println(pyramid);
    }
}
