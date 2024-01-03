
class A{
    A(){

        this(10);
    }
    A(int a){
        System.out.println(a);
    }

}
   




public class ThisKeywordUsedToCallParameterizeConstructor{
    public static void main(String[] args) {
        A ref = new A();
    }
}