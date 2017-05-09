package threads;

/**
 * Created by Administrator on 2017-5-9.
 */
public class Producer implements Runnable{
    Queue q;
    public Producer(Queue q){
        this.q = q;
    }
    @Override
    public void run() {
        int i=0;
        while (true){
            q.put(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
