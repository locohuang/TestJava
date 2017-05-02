package threads;

/**
 * Created by Administrator on 2017-5-2.
 */
public class TestMainThread {
    public static void main(String[] args) {
        //获取main线程的线程名
        //Thread的静态方法
        Thread t = Thread.currentThread();
        System.out.println("当前线程默认名称："+t.getName());
        t.setName("主线程");
        System.out.println("当前线程默认名称："+t.getName());

        int[]intArray = new int[]{1,2,3,4,5,6,7,8,9,10};
        try {
            for(int x:intArray){
                System.out.println(x);
                Thread.sleep(2000);//让当前的线程休眠1秒（1000毫秒）
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
