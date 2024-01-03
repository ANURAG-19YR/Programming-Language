import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReade {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Specify the path to your file

        try {
            FileReader fileReader = new FileReader(filePath); // Step 1: Create a FileReader
            BufferedReader bufferedReader = new BufferedReader(fileReader); // Step 2: Create a BufferedReader

            String line; // Step 3: Declare a String to store each line

            // Step 4: Read and process each line until the end of the file is reached
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Step 5: Process the line (in this example, we print it)
            }
            // int i;
            // while((i=fileReader.read())!=-1){
            //     System.out.println((char)i);
            // }

            bufferedReader.close(); // Step 6: Close the BufferedReader
        } catch (IOException e) {
            e.printStackTrace(); // Step 7: Handle exceptions if any
        }
    }
}
