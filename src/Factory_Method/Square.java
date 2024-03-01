package Factory_Method;

public class Square implements Shape {
   private double sideLength;

   public Square(int i) {
      this.sideLength = sideLength;
   }


   public double getArea() {
      return sideLength * sideLength;
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
