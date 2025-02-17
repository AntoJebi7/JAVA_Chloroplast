package OOPs.Threading;

public class RunnableClass implements Runnable {

    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            try {

                Thread.sleep(1000);

            }catch (InterruptedException e) {
                System.out.println("Failed Threading");
            }
            if(i==5){
                System.out.println("Times up");
                System.exit(0);
            }
        }
    }
}
