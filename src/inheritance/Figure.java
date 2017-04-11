package inheritance;

/**
 * Created by Administrator on 2017/4/10.
 * 该类为抽象类：在里面前面加abstract关键字修饰
 */
public abstract class Figure {
        double d1;
        double d2;
        public Figure(double a,double b){
            d1 = a;
            d2 =b;
        }
        //在一个没有方法体的方法名前面加abstract（抽象的）修饰，说明该方法是抽象方法
        //类里面含有抽象方法，那么这个类要使用abstract修饰，代表该类为抽象类
        public abstract double area();
        public abstract void f1();
        //抽象类里面可以包含非抽象方法
        public final void show(){

        }

   /* public double area(){
        System.out.println("图形形状尚未确定!");
        return  0;
    }*/

}
