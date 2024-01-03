public class Constructor {
    int age;
    String name;
    Constructor(){
        name="Anurag";
        age=19;
        System.out.println("My name is "+name+" and age is "+age);

    }
    void display(){
        // System.out.println("My name is "+name+" and age is "+age);
    }


    public static void main(String[] args) {
        Constructor obj = new Constructor();
        // obj.display();
    }
    
}
