class A{
    void add(){
        int a=10,b=20,c;
        c=a+b;
        System.out.println(c);
    }

    void add(int x,int y){
        int c = x+ y;
        System.out.println(c);
    }

    void add(double p, double q){
       double c = p + q;
        System.out.println(c);
    }
}

public class MethodLoading {
    public static void main(String[] args) {
        A obj = new A();
        obj.add(12.45,55.45);
        obj.add();
        obj.add(15,55);
    }
    
}
