import java.util.Scanner;

public class AverageOfNNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        
        // Initialize variables
        double sum = 0;
        
        // Read n numbers
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = input.nextDouble();
            sum += num;
        }
        
        // Calculate the average
        double average = sum / n;
        
        // Display the result
        System.out.println("Average of " + n + " numbers is: " + average);
        
        input.close();
    }
}
