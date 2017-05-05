package threads;

/**
 * Created by Administrator on 2017-5-5.
 */
public class MyThread extends Thread{
    public void run(){
        int i=0;
        while(true){
            System.out.println("myThread子线程:"+i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
