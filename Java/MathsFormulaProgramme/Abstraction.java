// for creating Abstraction we used abstract keyword befor method and class for hiding the data

import java.util.Scanner;

abstract class bank {
    public String bankName = "PNB";
    public String IFSC = "PNB123";

    public void bankDetail() {
        System.out.println("\nBank Name is : " + bankName + " and Your IFSC Code is : " + IFSC + "\n");
    }

    abstract void deposite();

    abstract void withdraw();

    abstract void CheckBalance();
}

class bankService extends bank {

    private double balance = 5000;
    private int password = 1234;

    void deposite() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ur password : ");
        int pass = sc.nextInt();
        if (pass == password) {
            System.out.println("Unlocked!");
            System.out.print("Enter ammount to deposite : ");
            int depos = sc.nextInt();
            System.out.println("Your bank balance was : Rs." + balance);
            balance = balance + depos;
            System.out.println("Now ur current balance after deposite : Rs." + balance);
            System.out.println("Thank You!");

        } else {
            System.out.println("Invalid Password! Try again");

        }
        sc.close();
    }

    void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ur password : ");
        int pass = sc.nextInt();
        if (pass == password) {
            System.out.println("Unlocked!");
            System.out.print("Enter ammount to Withdraw : ");
            int WD = sc.nextInt();
            System.out.println("Your bank balance was : Rs." + balance);
            balance = balance - WD;
            System.out.println("Now ur current balance after withdrawal Rs." + balance);
            System.out.println("Thank You!");

        } else {
            System.out.println("Invalid Password! Try again");
        }
        sc.close();
    }

    void CheckBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ur password : ");
        int pass = sc.nextInt();
        if (pass == password) {
            System.out.println("Now ur current balance is Rs." + balance);
            System.out.println("Thank You!");

        } else {
            System.out.println("Invalid Password! Try again");

        }
        sc.close();
    }

}

public class Abstraction {
    public static void main(String[] args) {
        bankService obj = new bankService();
        obj.bankDetail();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Our Bank provide this following services : ");
        System.out.println("For depsite enter  1 ");
        System.out.println("For withdraw enter  2 ");
        System.out.println("For balance enter  3 ");
        int choose = sc2.nextInt();

        switch (choose) {
            case 1:
                obj.deposite();
                break;
            case 2:
                obj.withdraw();
                break;
            case 3:
                obj.CheckBalance();
                break;

            default:
                System.out.println("Invalid Choose!");
                break;
        }
        sc2.close();
    }
}
