package Java_Examples;

public class PI {
	// Constant PI
    public static final double PI = 3.14159;

    // Method to calculate area
    public static double calculateArea(double radius) {
        return PI * radius * radius;
    }

    // Method to calculate circumference
    public static double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {

        double radius = 5.0;

        System.out.println("Circle radius: " + radius);
        System.out.println("Area: " + calculateArea(radius));
        System.out.println("Circumference: " + calculateCircumference(radius));
    }
}
