/**
 * Created by Administrator on 2017-3-17.
 */
public class TestClass {
    public static void main(String[] args) {
        //定义变量
        Box box1,box2;
        //创建对象 用new关键字创建（分配内存）
        //box1 = new Box();
        //box1.setDim(10,10,10);
        box1 = new Box(10,10,10);
        double volumn1 = box1.volumn();
        System.out.println("box1的容积:"+volumn1);


        box2 = new Box(5,5,6);
        //给实例变量赋值（通过对象访问到实例变量--属性---成员属性，通过.操作符访问）


        box2.width = 5;
        box2.height = 5;
        box2.depth = 5;
        /*double volumn = box1.width*box1.height*box1.depth;
        double volumn2 = box2.width*box2.height*box2.depth;
        System.out.println("volumn:"+volumn+"  volumn2:"+volumn2);*/

        /*int a = 20;
        int b= a;
        b= 30;
        System.out.println("a:"+a+ "  b:"+b);*/


    }
}
