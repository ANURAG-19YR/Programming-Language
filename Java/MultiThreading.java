
//multiThreading
class A extends Thread{
    @Override
    public void run(){  //since this run mrthod already written in Thread class i.e. we use @override
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }
}

//single thread
class B extends Thread{
    public void age(){  //here we use own method so we not use @Override
        for (int i = 0; i < 5; i++) {
            System.out.println(19);
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        // A obj = new A();
        // obj.start();
        // for (int i = 0; i < 5; i++) {        -->Multhreading program
        //     System.out.println("Main Thread");
        // }

        B obj = new B();
        obj.age();
        for (int i = 0; i < 5; i++) {
            System.out.println(20);
        }
    }
}
