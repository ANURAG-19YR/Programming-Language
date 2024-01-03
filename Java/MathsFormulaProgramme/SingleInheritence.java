class student{
    String collegeName= "B.k.Birla COllege";
    String Course = "Bsc Computerr Science";
    String name;
    int age;
    int id;
    void show(){
        System.out.println(collegeName);
        System.out.println(Course);
    }
}

class anurag extends student{
    void display(){
        name="Anurag";
        age = 19;
        id=3837892;
        System.out.println(name+" "+age+" "+id);
    }
}

public class SingleInheritence {
    public static void main(String[] args) {
        anurag obj =new anurag();
        obj.show();
        obj.display();
    }
}
