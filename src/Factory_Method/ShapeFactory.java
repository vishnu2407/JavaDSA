package Factory_Method;

public class ShapeFactory {

    public static Shape createShape(String type) {
        if (type.equals("circle")) {
            return new Circle(10); // You might want to pass a radius here
        } else if (type.equals("square")) {
            return new Square(10); // You might want to pass a side length here
        } else {
            throw new IllegalArgumentException("Invalid shape type");
        }
    }
}
