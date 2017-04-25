package exception;

/**
 * Created by Administrator on 2017-4-25.
 */
public class MyException extends Exception{
    private String info;
    public MyException(String info){
        this.info = info;
    }

    @Override
    public String toString() {
        return "MyException:["+info+"]";
    }
}
