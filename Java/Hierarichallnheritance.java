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

class Naimish extends student{
      void display(){
        name="Naimsih";
        age = 21;
        id=383452;
        System.out.println(name+" "+age+" "+id);
    }
}




public class Hierarichallnheritance{
    public static void main(String[] args) {
        System.out.println("\n");
        anurag obj = new anurag();
        obj.show();
        obj.display();
        System.out.println("\n");
        Naimish obj2 = new Naimish();
        obj.show();
        obj2.display();
        System.out.println("\n");
    }
}