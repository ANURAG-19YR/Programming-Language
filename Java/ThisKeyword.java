class A{
    void show(){
        System.out.println(this);
    }
}
class B{
    int a;//Instance Vairiable 
    B(int a){                          //A(int a) this is local variabele 
        this.a=a;       //this keyword reserved the current object or instance variable 
    }
    void display(){
        System.out.println(a);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        A ref = new A();
        System.out.println(ref);
        ref.show();
    
        B ref2 = new B(100);
        ref2.display();
    
    }
    
}
