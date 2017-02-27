/**
 * Created by Administrator on 2017/2/27.
 */
public class TestCast {
    public static void main(String[] args) {
        byte by = 10;
        double d = 12.5 ;
        int in;
        in = by;
        in = by+2;
        in = 500;
        by =(byte) in;
        in = (int)d;
        System.out.println(in);
    }
}
