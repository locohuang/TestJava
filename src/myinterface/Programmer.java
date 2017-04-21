package myinterface;

/**
 * Created by Administrator on 2017-4-18.
 */
public interface Programmer {
    void code();
    //这个方法叫接口的默认方法
    public default void displayId(String id){
        System.out.println("id:"+id);
    }
    default void add(){};
    public static void display(){
        System.out.println("static");
    }
}
