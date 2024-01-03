

class shape{
    void draw(){
        System.out.println("Can't draw becz shape nai pta hai..");
    }

}
class circle extends shape{
    @Override
    void draw(){
        System.out.println("Circle is define here so draw kro aur kya...");
    }
}



public class RuntimePolymorphism {
    public static void main(String[] args) {
        // circle obj = new circle();
        // obj.draw();
        shape r =new circle();
        r.draw();
    }
}
