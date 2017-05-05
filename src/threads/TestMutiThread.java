package threads;

/**
 * Created by Administrator on 2017-5-5.
 */
public class TestMutiThread {
    public static void main(String[] args) {
        //MyThread thread = new MyThread();
        //thread.start();//启动子线程
        //匿名对象:这个对象只使用一次
        new MyThread().start();
        //Runnable接口使用方式1：
        /*MyRunnable runnable = new MyRunnable();
        new Thread(runnable,"myRunnable子线程").start();*/
        //Runnable接口使用方式2：
        //new Thread(new MyRunnable(),"myRunnable子线程").start();
        //Runnable接口使用方式3：
        new Thread(new Runnable() {
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
        },"myRunnable子线程").start();
        //thread.run();
        mainLoop();
    }

    private static void mainLoop() {
        int i=0;
        while(true){
            System.out.println("main:"+i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
