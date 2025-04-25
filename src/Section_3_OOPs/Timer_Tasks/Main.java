package Section_3_OOPs.Timer_Tasks;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    // timer - scheduled or periodically(notify)
    // timertasks - task executed by timer
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int counter = 3;

            @Override
            public void run() {
                System.out.println("Timer task executed");
                counter--;
                if (counter == 0) {
                    System.out.println("task completed");
                    timer.cancel();
                }
            }


        };

        timer.schedule(task,0,1000); // task, delay ,period
    }
}
