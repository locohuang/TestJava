package inheritance;

/**
 * Created by Administrator on 2017/4/1.
 */
public class InheritanceB extends InheritanceA{
    int k;
    public void showk(){
        System.out.println("k="+k);
    }
    public void sum(){
        System.out.println("sum="+(m+n+k));
    }
}
