package Core_Java_Concepts.OOPS.Inheritance.Shapes.ThreeD;

public class Rectangular_Prism {

    public double area;
    public double volume;

    public Rectangular_Prism(double area, double volume) {
        this.area = area;
        this.volume = volume;
    }

    public double Area() {
        return area;
    }

    public double Volume() {
        return volume;
    }

    public String toString() {
        return "Rectangular_Prism: " + Area() + " " + Volume();
    }

}
