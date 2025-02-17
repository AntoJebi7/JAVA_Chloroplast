package OOPs.Threading.Multi_threading;

public class Main {
    // enables program to run multiple threads concurrently
    // thread is a set of instructions that run independently

    public static void main(String[] args) {
       // Runnable_MT runnable = new Runnable_MT() ;
        // thread 1
        Thread thread1 = new Thread(new Runnable_MT("Ping"));
        // thread 2
        Thread thread2 = new Thread(new Runnable_MT("Pong"));

        System.out.println("Game Start !"); // independent, doesnt wait for thread
        // so use join ()

        // running concurrently
        thread1.start();
        thread2.start();

        try{
            thread1.join();  //makes the current thread wait
            // until the specified thread(thread 1 and 2) finishes execution
            thread2.join();
        }catch (InterruptedException e){
            System.out.println("Main Thread Interrupted" + e);
        }


        System.out.println("Game End !"); // independent,doesnt wait for thread
        // so use join ()
    }
}
