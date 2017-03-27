/**
 * Created by Administrator on 2017/3/27.
 */
public class TestBox {
    public static void main(String[] args) {
       /* Box b1,b2;
        b1 = new Box(1,2,3);
        b2 = new Box(1,2);
        System.out.println("b1:"+b1.volumn());
        System.out.println("b2:"+b2.volumn());*/

        /*int a,b,c;
        a=10;b=20;c=30;
        System.out.println("调用前："+a+"   "+ b+"   "+c);
        incrTen(a,b,c);
        System.out.println("调用后："+a+"   "+ b+"   "+c);*/

        Box box = new Box(10,20,30);
        //Box box1 = box;
        System.out.println("调用前："+box.width+"   "+ box.height+"   "+box.depth);
        incrTen(box);
        System.out.println("调用后："+box.width+"   "+ box.height+"   "+box.depth);

        Box box1 = box.newBox();
        System.out.println("box1："+box1.width+"   "+ box1.height+"   "+box1.depth);

    }
    public static void incrTen(int a,int b,int c){
        a=a+10;
        b=b+10;
        c+=10;
    }
    public static void incrTen(Box b){
        b.width +=10;
        b.height+=10;
        b.depth+=10;
    }
}
