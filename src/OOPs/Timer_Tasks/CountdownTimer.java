package OOPs.Timer_Tasks;

import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int counter = 10;
            @Override
            public void run() {
                System.out.println(counter);
                counter--;
                if(counter == 0){
                    System.out.println("Happy Birthday");
                    timer.cancel();
                }
            }
        };
        //timer.schedule(task,0,1000);
        timer.scheduleAtFixedRate(task,0,1000);
    }
}
