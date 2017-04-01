package inheritance;

/**
 * Created by Administrator on 2017/4/1.
 */
public class TestInheritance {
    public static void main(String[] args) {
        InheritanceA superObj = new InheritanceA();
        superObj.m = 10;
        superObj.n = 20;
        System.out.println("显示superObj的内容");
        superObj.showmn();

        InheritanceB subObj = new InheritanceB();
        subObj.m = 1;
        subObj.n = 2;
        subObj.k =3;
        System.out.println("显示subObj的内容");
        subObj.showmn();
        subObj.showk();
        subObj.sum();

    }
}
