/**
 * Created by Administrator on 2017-3-31.
 */
public class Outer {
    private int m;
    private int n;

    //默认的构造方法
    public Outer(){}
    //构造方法
    public Outer(int m,int n){
        this.m = m;
        this.n = n;
    }
    //方法
    public int getSum(){
        return m+n;
    }
    //创建内部类对象
    public int newInner(){

        Inner inner = new Inner(3,4);
        inner.setMAndN(1,2);
        return inner.sum();
    }
    //定义内部类  加上static修饰是可以在外部创建内部类的对象，否则不行
    public class Inner{
        private int innerM;
        private int innerN;
        public Inner(int innerM,int innerN){
            this.innerM = innerM;
            this.innerN = innerN;
        }
        public void setMAndN(int a,int b){
            m = a;
            n = b;
        }
        public int sum(){
            return getSum()+innerM+innerN;
        }
    }
}
