import java.util.Scanner;

public class ParameterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of Rectangle : ");
        float length = sc.nextFloat();

        System.out.print("Enter width of Rectangle : ");
        float width = sc.nextFloat();

        float parameterOfRectangle = 2*(length + width);

        System.out.println("The parameter of Rectangle is : "+parameterOfRectangle);

        sc.close();
    }
    
}
