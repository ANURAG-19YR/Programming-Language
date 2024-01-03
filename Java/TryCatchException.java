public class TryCatchException {
    public static void main(String[] args) {
        int a = 10, b = 0, c;
    
        try {// Code that may throw an exception
            c = a / b;
            System.out.println(c);
        } catch (Exception e) { // Catch block handles the exception
            System.out.println(e);// here we display our custom msg too...
        } finally {
            // Finally block always gets executed, whether there's an exception or not
            System.out.println("Finally block executed");
        }

        // System.out.println("i am error ke bad ka line...");
    }
}
