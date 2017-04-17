package myinterface;

/**
 * Created by Administrator on 2017/4/17.
 */
public class TestInterface {
    public static void main(String[] args) {
        //定义接口变量
        MyInterface myInterface;
        MyImpl1 myImpl1 = new MyImpl1();
        myInterface = myImpl1;
        //myInterface.fn();
        //myImpl1.f1();
        myInterface.f1();
        MyImpl2 myImpl2 = new MyImpl2();
        myInterface = myImpl2;
        //myImpl2.f1();
        myInterface.f1();
        MyImpl3 myImpl3 = new MyImpl3();
        myImpl3.f1();
        myImpl3.f2(30);
    }
}
