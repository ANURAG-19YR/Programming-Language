class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
      this.age= age;
    }
    public int getAge() {
        return age;
    }
}

public class Encapsulationn {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alice");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
