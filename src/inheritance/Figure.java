package inheritance;

/**
 * Created by Administrator on 2017/4/10.
 */
public class Figure {
    double d1;
    double d2;
    public Figure(double a,double b){
        d1 = a;
        d2 =b;
    }
    public double area(){
        System.out.println("图形形状尚未确定!");
        return  0;
    }

}
