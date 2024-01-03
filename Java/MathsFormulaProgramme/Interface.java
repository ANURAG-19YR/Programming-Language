interface vehicle{
    //by default variable is pubic+static+final
    //final -->means this name anf speed is final u cannt change the name and speed in it,it is finally declared by company
    String name =  "Anurag";
    int speed = 100;

    //by default public + static
    void start();  //here we cannt define the method only decalare
    void stop();
}
class customer implements vehicle{
    @Override
    public void start(){
        System.out.println("Start() : insert key & press st button ");

    }
    @Override
    public  void stop(){
        System.out.println("stop() : exit key");

    }

    
}


public class Interface {
   
     public static void main(String[] args) {
        customer obj = new customer();
        obj.start(); obj.stop();
        
        System.out.println(vehicle.speed);//see we can access the class variable without creating an object because it is static
    }
}
