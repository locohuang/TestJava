package mypackage1;

/**
 * Created by Administrator on 2017-4-14.
 */
public class SubSamePackageDemo extends SameClassDemo{

    public void show1(){
        pub_a = 10;
        no_a = 20;
        pro_a =30;
        //pri_a =40; 同一个package里面的子类除了不能访问private成员之外，其它的都能访问
    }
}
