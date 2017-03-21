/**
 * Created by Administrator on 2017-3-21.
 */
public class TestStudent {
    public static void main(String[] args) {
        Student s1;//用Student类型定义变量
        //s1 = new Student();//通过new操作符创建对象（分配内存）
        s1 = new Student("1002","zhang");
        s1.setC1(100);
        s1.setC2(80);
        //s1 = new Student("1001","Li",90,80);
        //s1.init("1001","Li",90,80);
        System.out.println(s1.getNo()+"  "+s1.getName()+"  "+s1.getC1()+"  "+s1.getC2());

    }
}
