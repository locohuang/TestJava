/**
 * Created by Administrator on 2017/3/13.
 */
public class TestMethod {
    public static  void main(String[] args) {
        //printStar();//调用printStar方法
        ///printStar();
        //printStar(4,5);
        int result;
        result = add(10,20);
        System.out.println("result:"+result);
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static float add(float a,float b){
        return a+b;
    }
    public  void printStar(){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printStar(int m,int n){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
