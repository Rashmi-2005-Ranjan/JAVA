package in.kgcoding.file.trywithresource;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourceExample {
    public static void main(String[] args) {
        String fileName="try-with-resource.txt";
        try(FileWriter writer=new FileWriter(fileName)) {
            writer.write("Java's try-with-resources statement is a powerful feature that simplifies resource management by automatically closing resources when they are no longer needed.");
            for (int i=1;i<=10000;i++){
                writer.write ( "*" );
            }
            writer.flush ();
            System.out.println ("File written successfully: " + fileName);
        }catch (IOException exception){
            System.out.println ("Exception Occurred: " + exception.getMessage ());
        }
    }
}
