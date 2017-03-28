package cn.gdgm.jsj;

/**
 * Created by Administrator on 2017-3-28.
 */
public class AccessControl {
    final private int d;
    public static int a;
    int b;
    private int c;

    static {//静态代码块：每次创建对象，都会自动执行这代码块(只执行一次)
        a = 30;
        System.out.println("执行代码块:"+a);
    }

    public AccessControl() {
        d = 0;
    }

    void seta(int a){
        this.a = a;
    }

    public int getc(){
        c= a+b;
        return c;
    }
    public static void print(){
        System.out.println("这是类static方法" );
    }
    static void print3(){
        System.out.println("这是类static方法" );
    }
    public static void changeA(){
        a=10;
    }
}
