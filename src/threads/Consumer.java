package threads;

/**
 * Created by Administrator on 2017-5-9.
 */
public class Consumer implements Runnable{
    Queue q;
    public Consumer(Queue q){
        this.q = q;
    }
    @Override
    public void run() {
        while (true){
            q.get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
