package Patterns;

public class CirclePattern {
    // Function to print the pattern
    // n is the number of rows and columns
    public static void main(String[] args) {
        int radius = 6; // You can adjust the radius for a larger or smaller circle

        // Loop through the grid to print the circle
        for (int i = 0; i <= 2 * radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {
                // Calculate the distance of the point from the center
                double distance = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));

                // Print a star if the distance is close to the radius
                if (distance > radius - 0.5 && distance < radius + 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


//        int radius = 10;
//        double aspectRatio = 2;
//
//        for(int i = -radius; i <= radius; i++) {
//            for(int j = -radius; j <= radius; j++) {
//                if(Math.pow(i, 2) + Math.pow(j/aspectRatio, 2) <= Math.pow(radius, 2)) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }