import java.util.Scanner;

public class AreaofParallelogram{
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of Parallelogram :  ");
        float base=sc.nextFloat();

        System.out.print("Enter the height of Parallelogram :  ");
        float height=sc.nextFloat();

        float areaOfParallelogram = base * height;

        System.out.println("The area of Parallelogram is : "+areaOfParallelogram);

        sc.close();
    }
}