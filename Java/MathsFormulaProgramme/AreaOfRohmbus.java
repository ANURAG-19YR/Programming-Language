import java.util.Scanner;

public class AreaOfRohmbus{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Diagonal-1(D1) of Rohmbus :  ");
        float Diagonal1=sc.nextFloat();
        
        System.out.print("Enter the Diagonal-2(D2) of Rohmbus :  ");
        float Diagonal2=sc.nextFloat();

        float areaOfRohmbus = (Diagonal1 * Diagonal2)/2;

        System.out.println("The area of Parallelogram is : "+areaOfRohmbus);

        sc.close();
    }
}