package threads;

/**
 * Created by Administrator on 2017-5-9.
 */
public class Queue {
    private int n;
    private boolean valueSet = false;
    public synchronized int get(){
        while(!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        valueSet = false;
        notify();
        System.out.println(" 消费："+n);
        return n;
    }
    public synchronized void put(int n){
        while (valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        valueSet = true;
        this.n = n;
        System.out.println(" 生产："+n);
        notify();
    }
}
