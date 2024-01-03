public class TranferStatment {
    public static void main(String[] args) {
        for(int i = 1;i<=10;i++){
            if(i==5){
                break; //after 5 loop will terminated
            }
            System.out.println(i);
        }
        System.out.println("\n");
        for(int j = 1;j<=10;j++){
            if(j==5){
                continue; //at 5 loop will escape
            }
            System.out.println(j);
        }

        
    }
    
}
