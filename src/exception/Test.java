package exception;

/**
 * Created by Administrator on 2017/4/24.
 */
public class Test {
    public static void main(String[] args) {
        int[]array= new int[]{1,2,3,4,5};
        try {
            System.out.println(array[1]);
            System.out.println(array[4]);
            int c=3/0;
            System.out.println(c);
            System.out.println(array[5]);

        }catch (ArrayIndexOutOfBoundsException ex1){
            //System.out.println(ex1.getMessage());
            System.out.println("数组越界了！");
        }catch (ArithmeticException ex2){
            System.out.println("算术运算异常:除数不能为0！");
        }
        catch (Exception e3){
            System.out.println("有异常");
        }finally {
            System.out.println("我始终要执行的");
        }

        System.out.println("Hello");
    }
}
