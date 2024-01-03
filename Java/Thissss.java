class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("Hello, my name is " + this.name);
    }
}

public class Thissss {
    public static void main(String[] args) {
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");

        person1.introduce();
        person2.introduce();
    }
}

