import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter ur 1 number : ");
        int num1 = scan.nextInt();

        System.out.println("Enter ur 20 number : ");
        int num2 = scan.nextInt();

        System.out.println("Enter operation + - / : ");
        String operator = scan.nextLine();

        switch(operator){
            case "+":
            System.out.println("Adding number : "+(num1+num2));

        }
    }
    
}
