public class PrivateConstructor {
    int age;
    String name;

    private PrivateConstructor(){
        age= 19;
        name = "Anurag";
        System.out.println("My Name is : " +name + "\n and Age is : "+ age);
    }
    
    public static void main(String[] args) {
        PrivateConstructor obj = new PrivateConstructor();
    }
}
