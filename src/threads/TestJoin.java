package threads;

/**
 * Created by Administrator on 2017/5/8.
 */
public class TestJoin {
    public static void main(String[] args) {
        System.out.println("main thread start");

        Thread oneThread = new Thread(new MyJoinRunnable(),"one");
        Thread twoThread = new Thread(new MyJoinRunnable(),"two");
        Thread threeThread = new Thread(new MyJoinRunnable(),"three");

        oneThread.start();
        twoThread.start();
        threeThread.start();

        System.out.println("one线程状态："+oneThread.isAlive());
        System.out.println("two线程状态："+twoThread.isAlive());
        System.out.println("three线程状态："+threeThread.isAlive());

        try {
            oneThread.join();
            twoThread.join();
            threeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("one线程状态："+oneThread.isAlive());
        System.out.println("two线程状态："+twoThread.isAlive());
        System.out.println("three线程状态："+threeThread.isAlive());
        System.out.println("main thread end");
    }
}
