package myinterface;

/**
 * Created by Administrator on 2017/4/17.
 */
public class MyImpl2 implements MyInterface{
    @Override
    public void f1() {
        System.out.println("f1");
        System.out.println("这是另外一个接口的实现");
    }
}
