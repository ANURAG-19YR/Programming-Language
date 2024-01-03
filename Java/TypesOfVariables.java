public class TypesOfVariables {
    int age = 19; //instance Variable
    static float pi = 3.142f; //static Variable

    public static void main(String[] args) {
        String name = "Anurag Gupta "; //Local Variable

        System.out.println(name);
        
        //for accesing Class variable first we need to create obj of the class
        TypesOfVariables obj = new TypesOfVariables();
        System.out.println(obj.age);
        //But we Dont need to create obj if variable is static 
        // For Static no need obj for call the variable of that class
        System.out.println(pi);

        //we can print all variable in one line using concatination
        System.out.println(name+" "+obj.age+" "+pi);
    }
    
}
