/*Definition: Inheritance is a fundamental concept in Java that allows one class to inherit the properties and
 behaviors (fields and methods) of another class.

Base Class and Derived Class:
Base Class (Parent Class): The class whose properties and behaviors are inherited.
Derived Class (Child Class): The class that inherits from the base class. 

NOTE:
    1.In java extends keyword used to perform inheritance
    2.It provides code reusability
    3.We can't access private members of class through inheritance
    4.Method @overriding only possible through inheritance*/

class Animal {//It known as Super class
    // String name;
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {//It know as Sub-class
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.speak();
        obj.bark();


    }
}
