//Action is common but implementation is different then we use Abstraction Method
//mtlb animals ke alm0st sab ke 4 pair hote hai pr wah kaisi sound nikalte kya khate hai hume nai pta
//kyoki yeah confirm nai ki hum kis animals ke bare me baat kr rahe hai
//so sab animal ke pair ke property same hai but khate to sab hai pr kya kahte hai hume nai pta becz which animal is this not declared yet

abstract class animal {
    void legs() {
        System.out.println("Almost all animal has 4 legs! ");
    }

    abstract void sound(); // ab sound sab anumal krte hai but yeah specify nai hai ki konsa animal so it
                           // abstracted

    abstract void eat();
}

class Dog extends animal {
    // @Override  --> we use this notation override for understanding that is method is re write means already wriiteen but we rewrite in it again
    void sound() {
        System.out.println("Bow Bow...");
    }

    void eat() {
        System.out.println("Pedgree...");
    }
}

class Bakri extends animal {
    // @Override
    void sound() {
        System.out.println("May May...");
    }

    void eat() {
        System.out.println("Ghasss khati hai meri bakri...");
    }
}

public class AbstractionImplementationThroughOverride {

    public static void main(String[] args) {
        Bakri B = new Bakri();
        B.legs();
        B.sound();
        B.eat();
        System.out.println("\n");
        Dog D = new Dog();
        D.legs();
        D.sound();
        D.eat();
    }

}
