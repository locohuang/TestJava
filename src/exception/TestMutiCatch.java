package exception;

/**
 * Created by Administrator on 2017-4-25.
 */
public class TestMutiCatch {
    public static void main(String[] args) {
        int a,b,c;
        int[]array=new int[]{1,2,3};
        try{
            System.out.println("start");
            //a=2;b=0;c=a/b;
            System.out.println("end of ari");
            try{
                a=2;b=0;c=a/b;
                System.out.println(array[3]);
                System.out.println("end");
            }catch (ArrayIndexOutOfBoundsException e1){
                System.out.println("异常："+e1);
            }
        }catch (ArithmeticException e1){
            System.out.println("异常："+e1);
        }

    }
}
