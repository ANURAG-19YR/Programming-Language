public class TryCatch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        try{

            System.out.println(arr[5]);
        }
        catch(Exception except){
            System.out.println(except);
        }
        System.out.println("hii i m error ke bad ka line :D  ");
    }
    
}
