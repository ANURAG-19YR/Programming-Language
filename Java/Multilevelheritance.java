//super class
class Grandparent {
    void displayGrandparent() {
        System.out.println("I am the Grandparent.");
    }
}

//sub class 1
class Parent extends Grandparent {
    void displayParent() {
        System.out.println("I am the Parent.");
    }
}

//sub class 2
class Child extends Parent { 
    void displayChild() {
        System.out.println("I am the Child.");
    }
}



public class Multilevelheritance {
     public static void main(String[] args) {
        Child obj = new Child();
        obj.displayGrandparent(); // Inherited from Grandparent
        obj.displayParent();      // Inherited from Parent
        obj.displayChild();       // Defined in Child class
    }
}
