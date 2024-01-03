interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class Butterfly implements Animal, Bird {
    @Override
    public void eat() {
        System.out.println("Butterfly is sucking the flower.");
    }

    @Override
    public void fly() {
        System.out.println("Butterfly is flying in air.");
    }
}

public class MultipleInheritanceUsingInterface {

public static void main(String[] args) {
    Butterfly obj = new Butterfly();
    obj.eat();
    obj.fly();
    
}
}