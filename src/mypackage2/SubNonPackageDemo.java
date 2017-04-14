package mypackage2;
//import mypackage1.*;//导入mypackage1下面的所有的类
import mypackage1.SameClassDemo;//只引入一个类
/**
 * Created by Administrator on 2017-4-14.
 */
public class SubNonPackageDemo extends SameClassDemo{
    public void show3(){
        pub_a =10;
        pro_a = 10;
        //在不同package定义的子类，只能访问public及protected修饰的成员
        //pri_a = 10;
        //no_a=10;
    }
}
