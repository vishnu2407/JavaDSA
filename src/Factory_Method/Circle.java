package Factory_Method;

public class Circle implements Shape {
    private double radius;
    public Circle() {
        radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
