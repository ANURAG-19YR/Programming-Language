import java.io.File;

public class FileCreate {
    public static void main(String[] args) throws Exception{ //we can handle the error with throws in main method
        File r= new File("AnuragDetail.txt");
        // try{

            if(r.createNewFile()){
                System.out.println("File Created ");
            }
            else{
            System.out.println("file Aleready Exist..");
        // }
              }
    // catch(Exception e){
    //     System.out.println(e);
    // }

    //we can cretae without using condition we use condition only when we want to check that file is present or not
    File r2 = new File("AnuragDetail2.txt");
    r2.createNewFile();
    }
    }
    

