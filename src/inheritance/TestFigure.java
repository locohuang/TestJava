package inheritance;

/**
 * Created by Administrator on 2017-4-11.
 */
public class TestFigure {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(1,2);
        Triangle t = new Triangle(3,4);

        Figure f; //抽象类可以用来定义变量
        ///f = new Figure();  //Figure是抽象类，不能实例化（创建对象）
        f =r ;
        System.out.println(f.area());

        f = t;
        System.out.println(f.area());
        final int VAR =20 ;

        //VAR = 30;

        Object obj;
        obj = r;

    }

}
