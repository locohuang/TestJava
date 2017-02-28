/**
 * Created by Administrator on 2017-2-28.
 */
public class TestOperator {
    public static void main(String[] args) {
        int a=3,b=5,c;
        double d;
        c=a+b;
        c=a*b;
        c=a/b;
        d=a/b;
        d=a*1.0/b;
        d=(double)a/b;
        d=a/b*1.0;
        c = b%a;
        c=a%b;
        d =5.5%a;
        System.out.println("d="+d);
        //灵活运用/及%运算符解决一些实际问题
        //+=  -=  /= *= %=
        int a1,a2,a3;
        a1=2;a2=3;
        a2+=a1;  //a2=a2+a1;
        System.out.println("a2="+a2);
        //++  --
        int b1,b2,b3;
        b1=1;b2=2;
        b1++;//b1=b1+1;
        //b3=b2++;  //b3=b2;b2=b2+1;
        //System.out.println("b2="+b2+" b3="+b3);
        b3=++b2;  //b2=b2+1;b3=b2;
        System.out.println("b2="+b2+" b3="+b3);

        byte c1=3,c2=2,c3;
        c3= (byte)(c1&c2);
        System.out.println("c3 "+c3);

        int d1=17,d2;
        d2=d1<<2;//左移1位相当于*2
        d2=d1>>2;//右移1位相当于/2
        System.out.println("d2="+d2);
    }
}
