package inheritance;

/**
 * Created by Administrator on 2017/4/10.
 */
public class TestOverride {
    public static void main(String[] args) {
        Figure f = new Figure(1,2);
        Rectangle r = new Rectangle(3,4);
        Triangle t = new Triangle(4,5);
        /*System.out.println(f.area());
        System.out.println(r.area());
        System.out.println(t.area());*/
        Figure ref;
        ref = r;
        System.out.println(ref.area());
        ref = t;
        System.out.println(ref.area());
    }
}
