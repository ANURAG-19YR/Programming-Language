import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//system.in means taking input from system input i.e. our keyboard

        System.out.print("Enter ur name : ");
        String input_name = sc.nextLine();

        System.out.print("Enter ur age : ");
        int age = sc.nextInt();
        
        System.out.println("ur name is : "+input_name+" and ur age is : "+age);

        sc.close();

    }
    
}
