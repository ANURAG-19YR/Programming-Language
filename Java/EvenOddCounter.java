import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int evenCount = 0;
        int oddCount = 0;
        
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
        
        scanner.close();
    }
}
