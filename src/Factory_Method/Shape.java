package Factory_Method;

public interface Shape {
    double area();
    double perimeter();
}

class circle implements Shape {
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class square implements Shape {
    private double sideLength;

    public square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }

    @Override
    public double perimeter() {
        return 4 * sideLength;
    }
}

