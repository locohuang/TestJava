package mypackage1;

/**
 * Created by Administrator on 2017-4-14.
 */
public class SamePackageDemo {
    public void show2(){
        SameClassDemo scd = new SameClassDemo();
        scd.pro_a = 10;
        scd.no_a = 10;
        scd.pub_a = 10;
        //scd.pri_a=10;//同一个package里面的非子类除了不能访问private成员之外，其它的都能访问
    }
}
