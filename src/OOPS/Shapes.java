package OOPS;

public class Shapes {

    public static void main(String[] args) {
        // Example usage for each shape (replace with your calculations)
        printCone(5.0, 7.0);
        printCube(10.0);
        printCuboid(8.0, 6.0, 4.0);
        printCylinder(3.0, 7.0);
        printEllipsoid(3.0, 2.0, 1.0);
        printEllipticCylinder(4.0, 2.0, 8.0);
        printPyramid(6.0, 10.0);
    }

    private static void printCylinder(double radius, double height) {
        // Calculate volume (replace with actual formula)
        double volume = Math.PI * radius * radius * height; // Implement cylinder volume formula

        System.out.println("      +------+");
        System.out.printf("     /       \\ (%f)\n", radius);
        System.out.println("    |         |");
        for (int i = 0; i < Math.round(height); i++) {
            System.out.println("    |         |");
        }
        System.out.printf("     \\       / (%f)\n", radius);
        System.out.println("      +------+");

        // Print calculated volume
        System.out.printf("Volume of the cylinder: %.2f\n", volume);
    }

    private static void printPyramid(double v, double v1) {
    }

    private static void printEllipticCylinder(double v, double v1, double v2) {
    }

    private static void printEllipsoid(double v, double v1, double v2) {
    }

    public static void printCone(double radius, double height) {
        // Calculate volume (replace with actual formula)
        double volume = Math.PI * radius * radius * height / 3; // Implement cone volume formula

        System.out.println("      + ");
        System.out.printf("     / \\ (%f)\n", radius);
        for (int i = 0; i < Math.round(height); i++) {
            System.out.println("    /   \\");
        }
        System.out.println("   /_____\\");
        System.out.printf("Volume of the cone: %.2f\n", volume);
    }

    public static void printCube(double side) {
        // Calculate volume (side^3)
        double volume = side * side * side;

        System.out.println("  -------");
        for (int i = 0; i < Math.round(side); i++) {
            System.out.println(" |       |");
        }
        System.out.println("  -------");
        System.out.printf("Volume of the cube: %.2f\n", volume);
    }

    public static void printCuboid(double length, double width, double height) {
        // Calculate volume (length * width * height)
        double volume = length * width * height;

        // Adjust dashes and spaces based on side lengths
        String sideLine = "";
        for (int i = 0; i < Math.round(length); i++) {
            sideLine += "-";
        }
        System.out.println("+" + sideLine + "+");
        for (int i = 0; i < Math.round(height); i++) {
            System.out.println("|" + String.format("%-" + Math.round(length) + "s", " ") + "|");
        }
        System.out.println("+" + sideLine + "+");
        System.out.printf("Volume of the cuboid: %.2f\n", volume);
    }

    // Implement similar methods for ellipsoid, elliptic_cylinder, pyramid, rectangular_prism
    // Replace ... with volume calculation formulas and ASCII art designs for each shape

}



