package OOPs.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

//    4 options :
//    FileWriter - good for small files,
//    BufferedWriter = better performance ,
//    PrintWriter - Best for structured data like reports,
//    FileOutputStream - Best for binary files like images, audio etc..
    static String filepath = "";
    public static void main(String[] args) {
        try(FileWriter fwriter = new FileWriter(filepath)){
            fwriter.write("Hello World Untitled2.py");
            System.out.println("done success");
        }catch(FileNotFoundException e){
            System.out.println("file not found");
        }
        catch(IOException e){
            System.out.println("file write failed");
        }
    }

}
