import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of Rectangle :  ");
        float length=sc.nextFloat();

        System.out.print("Enter the width of Rectangle :  ");
        float width=sc.nextFloat();

        float areaOfRectangle = width * length;

        System.out.println("The area of Rectangle is : "+areaOfRectangle);

        sc.close();
    }
    
}
