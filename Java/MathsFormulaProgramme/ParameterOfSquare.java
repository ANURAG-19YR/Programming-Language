import java.util.Scanner;

public class ParameterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of Square : ");
        float side = sc.nextFloat();

        float parameterOfSquare = 4*side;

        System.out.println("The parameter of Square is : "+parameterOfSquare);

        sc.close();
    }
    
}
