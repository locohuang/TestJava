package inheritance;

/**
 * Created by Administrator on 2017-4-7.
 */
public class TestABC {
    public static void main(String[] args) {
        A a = new A();
        B b =new B();
        C c =new C();
        //子类对象可以赋值给父类变量
        A ref ;
        ref = a;
        ref.callMe();
        ref = b;
        ref.callMe();
        ref = c;
        ref.callMe();
    }
}
