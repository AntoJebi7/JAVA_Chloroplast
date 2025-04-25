package Section_2_Methods.AlarmClock;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    // alarm clock
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime now = null;
        String filePath = "src\\Methods\\AudioPlayer\\assets\\tone_2.wav";
        while(now==null){
            try {
                System.out.println("Enter alarm time (HH:mm:ss) : ");
                String time = input.nextLine();
                now = LocalTime.parse(time,formatter);
            }catch (DateTimeException e){
                System.out.println("invalid format");
            }
        }

        AlarmClock_Project alarmClock = new AlarmClock_Project(now,filePath
        ,input);
        Thread alarmthread = new Thread(alarmClock);
        alarmthread.start();




    }
}
