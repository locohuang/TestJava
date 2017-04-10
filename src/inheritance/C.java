package inheritance;

/**
 * Created by Administrator on 2017-4-7.
 */
public class C extends B{
    public C(){

    }
    //方法的重载
    public void f1(){

    }
    public void f1(int n){

    }
    public void f1(int m,int n){

    }
    public void f1(double m,int n){

    }
    public void callMe(){
        System.out.println("执行C里面的callMe");
    }
}
