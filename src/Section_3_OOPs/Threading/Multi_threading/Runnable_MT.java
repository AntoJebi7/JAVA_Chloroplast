package Section_3_OOPs.Threading.Multi_threading;

public class Runnable_MT implements Runnable {
    private final String text;
    public Runnable_MT(String text) {
        this.text = text;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
           // System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(1000);  // wait
                System.out.println(i +" "+ Thread.currentThread().getName()
                +" "+Thread.currentThread().threadId() +" "+ text);

            }catch (InterruptedException e){
                System.out.println("Thread interrupted");
            }

        }
    }
}
