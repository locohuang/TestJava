package exception;

/**
 * Created by Administrator on 2017-4-25.
 */
public class TestThrows {
    public static void main(String[] args) {
        try {
            System.out.println(divide(3,0));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int divide(int a,int b) throws Exception{
        return a/b;
    }
}
