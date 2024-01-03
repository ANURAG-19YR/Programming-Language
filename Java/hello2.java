import java.util.Scanner;

public class hello2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        
        long tempNumber = Math.abs(number); // Convert negative numbers to positive for simplicity
        
        long digitSum = 0;
        while (tempNumber > 0) {
            long digit = tempNumber % 10;
            digitSum += digit;
            tempNumber /= 10;
        }
        
        System.out.println("The sum of the digits of the number is: " + digitSum);
        
        sc.close();
    }
}
