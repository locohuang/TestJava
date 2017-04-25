package exception;

/**
 * Created by Administrator on 2017-4-25.
 */
public class TestMyException {
    public static void main(String[] args) {
        try {
            System.out.println(getFiveString("126"));
        } catch (MyException e) {
            System.out.println(e);
        }
    }

    public static String getFiveString(String str)throws MyException{
        if(str.length()<5){
            throw new MyException("字符串字符个数少于5");
        }
        return str.substring(0,5);
    }
}
