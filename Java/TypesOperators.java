public class TypesOperators {
    public static void main(String[] args) {
        //Arthmatic Operator --> +, *, /, -
        System.out.println(4+5);
        System.out.println(8-5);
        System.out.println(4/2);
        System.out.println(4*5);

        //Increment & Decrement Operators
        int num1=15;
        System.out.println(num1);
        System.out.println(num1++);
        System.out.println(++num1);//17
        System.out.println(num1--);
        System.out.println(--num1);//15

        //Assignment Operator --> =, =+, -=,etc
        int num2=16;
        num2 +=4; //num2=num2 + 4 = 16 + 4 = 20
        System.out.println(num2);

        //Comparision Operator --> ==, >=, <=, !=, > , < .
        int num3=10,num4=12;
        System.out.println(num3>num4);//f
        System.out.println(num3!=num4);//t
        System.out.println(num3==num4);//f
        System.out.println(num3<num4);//t

        //Logiccal Operator
        //&&(AND operator) --> if both condition is true then true
        //||(OR operator) -->  if any one condition is true then true
        //! (NOT operator) --> if true then false
        int num5=10,num6=15;
        System.out.println(num5==num6 && num5!=num6);
        System.out.println(num5==num6 || num5!=num6);
        System.out.println(!(num5==num6));

        // Ternary Operator
        int a=10,b=30,c=20;
        int res=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(res);

        



    }
    
}
