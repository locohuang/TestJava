package threads;

/**
 * Created by Administrator on 2017-5-5.
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        int i=0;
        while(true){
            System.out.println("myRunnable子线程:"+i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
