package Methods.AudioPlayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // play audio with java (.wav , .au , .aiff)
        String FilePath1 = "src\\Methods\\AudioPlayer\\assets\\tone_1.wav";
        String FilePath2 = "src\\Methods\\AudioPlayer\\assets\\tone_2.wav";
        File file = new File(FilePath2);
        Scanner scanner = new Scanner(System.in);
        try( scanner ;
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response="";
            while(!response.equals("Q")){
                System.out.println("P=Play");
                System.out.println("S=Stop");
                System.out.println("R=Reset");
                System.out.println("Q=Quit");
                System.out.println("Enter your choice : ");
                response = scanner.nextLine().toUpperCase();
                switch(response){
                    case "P"->clip.start();
                    case "S"->clip.stop();
                    case "R"->clip.setMicrosecondPosition(0);
                    case "Q"->clip.close();
                    default -> System.out.println("invalid choice");
                }
            }
            System.out.println("audio streamed");
        }catch(FileNotFoundException e){
            System.out.println("file not found");
        }catch(IOException e){
            System.out.println("failed");
        }catch(UnsupportedAudioFileException e){
            System.out.println("failed format");
        }catch(LineUnavailableException e){
            System.out.println("failed " + e.getMessage());
        }
        finally {
            System.out.println("stream ended");
            scanner.close();
        }
    }
}
