package myinterface;

/**
 * Created by Administrator on 2017/4/17.
 */
public class MyImpl3 implements MyInterface,MyInterface2{
    @Override
    public void f1() {
        System.out.println("myImpl3   f1");
    }

    @Override
    public void f2(int param) {
        System.out.println("myImpl3 f2"+param);
    }
}
