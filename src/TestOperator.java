import java.util.Arrays;

/**
 * Created by Administrator on 2017-2-28.
 */
public class TestOperator {
    public static void main(String[] args) {
        /*int a=3,b=5,c;
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
        */
        int e1=4,e2=4;
        System.out.println(e2==e1);

        int x=0;
        System.out.println(x>=-4 & x<=5);

        int f1=5,f2=6;
        boolean boo1=false,boo2=false;
        //System.out.println(""+((boo1=f1>f2) && (boo2=f2>f1)));
        System.out.println(""+((boo1=f1>f2) & (boo2=f2>f1)));
        System.out.println("boo1:"+boo1+"  boo2:"+boo2);

        int g1=30,g2=0;
        /*if(g2!=0) {
            System.out.println(g1 / g2);
        }else{
            System.out.println("除数不能为0");
        }*/
        //System.out.println(g1 / g2);
        /*try{
            System.out.println(g1 / g2);
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }finally {
            System.out.println("不管有没有异常都会执行到这里！");
        }*/
       //int result=0;
        boolean bo=(g2!=0) && (g1/g2<0);
        int h1=3,h2=6,h3;
        //h3 = h2<h1 ? h1*3 : h2*3;
        //运算规则，判断表达式1（h2>h1），如果产生的值为true，用表达式2（h1*3）产生的值赋值给h3；
        //如果表达式1产生的值为false，用表达式3（h2*3）产生的值赋值给h3；
        //等价形式：
        if(h2<h1){
            h3=h1*3;
        }else{
            h3=h2*3;
        }
        System.out.println("h3="+h3);


        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println("s1="+s1+"  s2="+s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
