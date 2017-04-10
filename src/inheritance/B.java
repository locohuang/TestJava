package inheritance;

/**
 * Created by Administrator on 2017-4-7.
 */
public class B extends A{
    public B(){

    }
    public void show(){
        super.show();
        System.out.println("执行B里面的show");
    }
    public void callMe(){
        System.out.println("执行B里面的callMe");
    }
}
