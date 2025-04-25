package Section_2_Methods.AlarmClock;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock_Project implements Runnable {
    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner inputType;
    AlarmClock_Project(LocalTime alarmTime , String filePath, Scanner inputType) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.inputType = inputType;
    }

    @Override
    public void run() {
        System.out.println("Alarm clock started");
        while(LocalTime.now().isBefore(alarmTime)){
            try{
                Thread.sleep(1000);
                LocalTime now = LocalTime.now();

                System.out.printf("\r%02d: %02d: %02d", now.getHour(),
                        now.getMinute(), now.getSecond());

            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        System.out.println("\nAlarming....");
        //Toolkit.getDefaultToolkit().beep();
        playSound(filePath);

    }
    private void playSound(String filePath){
        File audio_file = new File(filePath);
        try(AudioInputStream audio_input= AudioSystem.getAudioInputStream(audio_file)){
            Clip clip = AudioSystem.getClip();
            clip.open(audio_input);
            clip.start();
            System.out.print("press enter to stop");
            inputType.nextLine();
            clip.stop();
            inputType.close();
        }catch (UnsupportedAudioFileException e){
            System.out.println("Audio file not supported");
        }catch(LineUnavailableException e){
            System.out.println("Audio Line unavailable");
        }catch(IOException e){
            System.out.println("IO exception");
        }

    }
}
