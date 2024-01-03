class A{
    A(){
        System.out.println("I am default constructor ");
    }
    A(int a){
        this();//here this keyword used to call default constructor
        System.out.println(a);    
    }
    
}


public class ThisKeywordUsedToCallDefaultConstructor {
    public static void main(String[] args) {
        A ref = new A(10);
    }
}
