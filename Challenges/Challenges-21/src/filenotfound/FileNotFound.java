package filenotfound;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileNotFound {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Enter The File Name for Reading" );
        String fileName = sc.nextLine ( );
        try (FileReader fileReader = new FileReader ( fileName )) {
            int read;
            while ((read = fileReader.read ( )) != -1) {
                System.out.print ( (char) read );
            }
        } catch (FileNotFoundException exception) {
            System.out.println ( "File Not Found: " + exception.getMessage ( ) );
            System.out.println ( "Please check the file name and try again." );
        } catch (IOException exception) {
            System.out.println ( "Exception Occurred: " + exception.getMessage ( ) );
        }
    }
}
