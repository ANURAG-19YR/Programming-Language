import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, World!");
            writer.close(); // Close the FileWriter when done
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
 