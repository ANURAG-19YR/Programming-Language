class A{
    int age = 18;
}
class B extends A{
    int age = 19;

    void show(){
        System.out.println(age);//Without super keyword it will give priority to its variable first so 19 will print
        System.out.println(super.age);
    }
}

class C{
    void display(){
        System.out.println("I m Super class ");
    }
}
class D extends C{
    void display(){
        super.display();
        System.out.println("I m sub class of super class ");
    }
}

class E {
    E(){
        System.out.println("I am main constructor or super class ");
    }
}
class F extends E{
    F(){
        // super();  withou super keyword this defaultly add the super keyword but it is only applicable for default constructor
        System.out.println("I am Copied constructor or Sub class");
    }

}

public class SuperKeyword {

public static void main(String[] args) {
    B obj = new B();
    obj.show();

    D obj2 = new D();
    obj2.display();

    F obj3 = new F();




}

    
}
