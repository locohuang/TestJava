package inheritance;

/**
 * Created by Administrator on 2017/4/10.
 */
public class Triangle extends Figure{
    public Triangle(double a,double b){
        super(a,b);
    }
    public double area(){
        return d1*d2/2;
    }

    @Override
    public void f1() {

    }
}
