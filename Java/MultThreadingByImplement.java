class A implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Anurag");
        }
    }
}

public class MultThreadingByImplement {
    public static void main(String[] args) {
        A obj = new A();
        // obj.start();
        Thread obj2 = new Thread(obj);
        obj2.start();
{
        for (int i = 0; i < 5; i++) {
            System.out.println("Lala");
        }

    }
    
    }
}
