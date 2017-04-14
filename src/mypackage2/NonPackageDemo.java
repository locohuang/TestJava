package mypackage2;


import mypackage1.SameClassDemo;

/**
 * Created by Administrator on 2017-4-14.
 */
public class NonPackageDemo {
    public void show4(){
        SameClassDemo scd = new SameClassDemo();
        scd.pub_a = 10;
        //scd.no_a = 20;
        //scd.pro_a =30;
        //scd.pri_a =40; 在不同package里面的非子类只能访问public修饰的成员
    }
}
