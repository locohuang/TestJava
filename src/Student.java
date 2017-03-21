/**
 * Created by Administrator on 2017-3-21.
 */
public class Student {
    private String no;
    private String name;
    private int c1;
    private int c2;
    //用构造方法进行初始化
    //什么叫构造方法：本质上就是方法，不过比较特殊：没有返回值（没有return），也没有void，方法名与类名相同
    //如果我们定义类没有指定构造方法，那么系统会默认给创建一个构造方法
    /*public Student(){

    }*/
    //如果我们自己定义了构造方法，那么系统就不会再给默认的构造方法
    //构造方法的重载

    public Student() {
    }

    public Student(String no, String name) {
        this.no = no;
        this.name = name;
    }

    /*public Student(String no, String name, int c1, int c2) {
        this.no = no;
        this.name = name;
        this.c1 = c1;
        this.c2 = c2;
    }*/

    /*public void init(String no,String name,int c1,int c2 ){
            this.no = no;
            this.name = name;
            this.c1 = c1;
            this.c2 = c2;
        }*/
    public String getName(){
        return name;
    }

    public String getNo() {
        return no;
    }

    public int getC1() {
        return c1;
    }

    public int getC2() {
        return c2;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }
}
