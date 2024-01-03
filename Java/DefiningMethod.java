// import java.util.Scanner;

import java.util.Scanner;

public class DefiningMethod{
        //here we define the Method or Function
        int addition(int a,int b){
                int c = a+b;
                return c;
        }
        //Creating Method with static Keywords
        static void Personaldetails(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter ur Name : " );
                String name = sc.nextLine();
                System.out.println("Enter ur Age : " );
                String Age = sc.nextLine();
                System.out.println("Your Name is : "+name+" Your age is : "+Age);
        }
        public static void main(String[] args) {
                DefiningMethod obj = new DefiningMethod();
                System.out.println(obj.addition(4,5));
                System.out.println(obj.addition(9,9));
                System.out.println(obj.addition(15,10));
                System.out.println(obj.addition(20,5));

                Personaldetails();
        }
}