package mypackage1;

/**
 * Created by Administrator on 2017-4-14.
 */
public class SameClassDemo {
    public int pub_a=10;
    int no_a=20;
    protected int pro_a=30;
    private int pri_a = 40;

    public void show(){
        pub_a = 11;
        no_a = 21;
        pro_a = 31;
        pri_a =41;
    }
    //在用同一个类的内部所有访问修饰的成员都可以访问
}
