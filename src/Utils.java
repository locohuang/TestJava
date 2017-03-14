/**
 * Created by Administrator on 2017-3-14.
 */
public class Utils {
    public static boolean isPre(int m){
        for(int i=2;i<m;i++){
            if(m%i==0){
                return false;
            }
        }
        return true;
    }
    //可变长参数的方法
    public static int sum(int...ints){
        int s=0;
        for(int x:ints){
            s+=x;
        }
        return s;
    }
    public static double sum(double d,int...ints){
        int s=0;
        for(int x:ints){
            s+=x;
        }
        return s+d;
    }
    public static double sum(double d,double d2,int...ints){
        int s=0;
        for(int x:ints){
            s+=x;
        }
        return s+d;
    }
    //方法的重载
    /*public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }*/
}
