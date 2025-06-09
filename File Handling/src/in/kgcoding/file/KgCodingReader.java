package in.kgcoding.file;

import java.io.FileReader;
import java.io.IOException;

public class KgCodingReader {
    public static void main(String[] args) {
        String fileName="try-with-resource.txt";
        try (FileReader fileReader=new FileReader ( fileName )){
            int read=0;
            do{
                read= fileReader.read ();
                System.out.print((char) read);
            }while (read!=-1);
        }catch (IOException exception){
            System.out.println ("Exception Occurred "+exception.getMessage ());
        }
    }
}
