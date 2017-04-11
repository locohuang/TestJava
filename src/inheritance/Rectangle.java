package inheritance;

/**
 * Created by Administrator on 2017/4/10.
 * 说明：如果一个类继承自一个抽象类，要么把该类也变成抽象的，要么在该类里面对父类的抽象方法进行实现（定义）
 */
/*
public abstract class Rectangle extends Figure{
    public Rectangle(double a,double b){
        super(a,b);
    }
}*/
public  class Rectangle extends Figure{
    public Rectangle(double a,double b){
        super(a,b);
    }
    //方法的实现（定义）
    public  double area(){
        return d1*d2;
    }
    //不可以重写父类使用final修饰的方法
    /*public void show(){

    }*/
    @Override
    public void f1() {

    }
}
