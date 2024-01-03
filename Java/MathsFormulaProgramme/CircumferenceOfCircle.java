import java.util.Scanner;

public class CircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of circle : ");
        float radius = sc.nextFloat();
        System.out.println("here we Take pi value : 3.142");

        float circumferenceOfCircle = 2*radius*3.142f;

        System.out.println("The circumference of the Circle is : "+ circumferenceOfCircle);

        sc.close();
    }
    
}
