package mypackage3;
import mypackage1.SameClassDemo;

import mypackage2.*;
/**
 * Created by Administrator on 2017-4-14.
 */
public class TestSameClass {
    public void show(){
        SameClassDemo scd1 = new SameClassDemo();
        mypackage2.SameClassDemo scd2 = new  mypackage2.SameClassDemo();
    }
}
