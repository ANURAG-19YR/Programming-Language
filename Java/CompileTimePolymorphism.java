// in this CompileTimePolymorphism compiler know which method should call first at a time of compilation

class A{
    
    void add(){
        int x=10,y=20,z;
        z=x+y;
        System.out.println(z);
    }

    void add(int a,int b){
        int c=a+b;              //all method name is same but same functon addition but behaviour is different                              
        System.out.println(c);     // like with parameter or without parameter diff input types 
    }       

    void add(float p , float q){
        float r=p+q;
        System.out.println(r);
    }
}


public class CompileTimePolymorphism {
    public static void main(String[] args) {
        A r = new A();
        r.add(10, 50);
        r.add();//it is 1st method but it will call 2nd becz compiler know it behaviour is different
        r.add(10.5f,55.55f);
    }
}
