import cn.gdgm.jsj.AccessControl;

/**
 * Created by Administrator on 2017-3-28.
 */
public class TestAccess2 {
    public static void main(String[] args) {
        AccessControl ac = new AccessControl();
        //ac.a = 10;ac.b = 20;
        //ac.seta(30);
        System.out.println(ac.a+ "  "+ac.getc());
        AccessControl.print();
        System.out.println(AccessControl.a);
    }
}
