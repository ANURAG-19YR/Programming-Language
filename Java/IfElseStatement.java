import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ur age : ");
        int age = sc.nextInt();

        if(age>18){
            System.out.println("U can Vote! ");
        }
        // else if(conditn){}
        else{
            System.out.println("U can not Vote!");
        }
        
        sc.close();
    }
    
}
