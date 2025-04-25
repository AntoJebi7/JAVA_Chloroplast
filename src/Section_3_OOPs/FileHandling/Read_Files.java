package Section_3_OOPs.FileHandling;

import java.io.*;

public class Read_Files {
    static String filepath = "";
    public static void main(String[] args) {
        //BufferedReader + FileReader for line by line read
        //FileInputStream - best for binary files
        // RandomAccessFile - Best for read/write specific portions of large file
        try(BufferedReader br = new BufferedReader(new FileReader(filepath));) {
            String line;
            while ((line = br.readLine()) !=null) {
                System.out.println(line);
            }
            System.out.println("read success");
        }catch(FileNotFoundException e){
            System.out.println("read Failed");
        }
        catch(IOException e){
            System.out.println("read Failed IOException");
        }
    }
}
