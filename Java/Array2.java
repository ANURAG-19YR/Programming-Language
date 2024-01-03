import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of elements : ");
        int size = sc.nextInt();

        System.out.print("Enter "+size + " Elements!");



        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            
             arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            
            System.out.print(arr[i]+ " ");
        }
        sc.close();
    }
}
