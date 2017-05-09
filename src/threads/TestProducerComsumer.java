package threads;

/**
 * Created by Administrator on 2017-5-9.
 */
public class TestProducerComsumer {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        new Thread(producer,"p").start();
        new Thread(consumer,"c").start();
    }
}
