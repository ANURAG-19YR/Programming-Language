class A{
    int age = 19;
    String name  = "Anurag";

    //get the data member
    int getage(){
        return age;
    }
    String getname(){
        return name;
    }
    
    //set the data member
    void setage(int agee){
        age=agee;
        System.out.println(age);
    }
    void setname(String name){
        this.name=name; //to avoid the same data member we use this keyword
        System.out.println(name);
    }
}



public class ThisKeywordSimpleEx {
    public static void main(String[] args) {
        A r = new A();
        System.out.println(r.getname());
        System.out.println(r.getage());

        r.setage(20);
        r.setname("Lala");
    }
    
}
