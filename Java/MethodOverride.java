class Shape{
    void draw(){
        System.out.println("Currently dont know the shape...");
    }
}

class Square extends Shape{
    @Override
    void draw(){
        System.out.println("I am drawing square...");
    }
}


class circle extends Shape{
    @Override
    void draw(){
        System.out.println("I am drawing circle...");
    }
}


public class MethodOverride {
    public static void main(String[] args) {
        Shape obj = new Square();
        obj.draw();

        Shape obj2 = new circle();
        obj2.draw();

        Shape obj3 = new Shape();
        obj3.draw();
    
        
    }
    
}
