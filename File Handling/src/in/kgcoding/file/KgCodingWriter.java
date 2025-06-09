package in.kgcoding.file;

import java.io.FileWriter;
import java.io.IOException;

public class KgCodingWriter {
    public static void main(String[] args) {
        String fileName="java-course.txt";
        FileWriter writer=null;
        try{
            writer=new FileWriter ( fileName );
            writer.write ( "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible." );
            writer.flush ();
            System.out.println ("File written successfully: " + fileName);
        }catch (IOException exception){
            System.out.println ("Exception Occurred: " + exception.getMessage ());
        }finally {
            if(writer!=null){
                try{
                    writer.close ();
                }catch (IOException e){
                    System.out.println ("Error closing the writer: " + e.getMessage ());
                }
            }
        }
    }
}
