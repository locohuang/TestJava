/**
 * Created by Administrator on 2017-3-31.
 */
public class TestInner {
    public static void main(String[] args) {
        //Outer outer = new Outer(1,2);
        //Outer.Inner inner = new Outer.Inner(3,4);
        Outer outer = new Outer();
        System.out.println("sum="+outer.newInner());
    }
}
