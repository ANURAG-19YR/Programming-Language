public class NestedIfElse {
    public static void main(String[] args) {
        int num1=40,num2=20,num3=30;

        if(num1>num2)
        {
            if(num1>num3){
                System.out.println("The bigger number is : "+num1);
            }
           else{
            System.out.println("The Maximum number is : "+num3);
                }
        }   
        else{
            System.out.println("The maximum number is  : "+num2);
        }
}
}