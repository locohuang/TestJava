package threads;

/**
 * Created by Administrator on 2017/5/8.
 */
public class MyJoinRunnable implements Runnable{
    @Override
    public void run() {
        int i=10;
        while(i>=0){
            System.out.println(Thread.currentThread().getName()+":"+i--);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
