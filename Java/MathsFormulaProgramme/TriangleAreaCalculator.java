import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the base and height of the triangle
        System.out.print("Enter base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area of the triangle
        double area = (base * height) / 2.0;

        // Display the result
        System.out.println("The area of the triangle is: " + area);

        scanner.close();
    }
}
