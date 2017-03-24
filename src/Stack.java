/**
 * Created by Administrator on 2017-3-24.
 * Stack类：有两种操作：（1）进栈--push（int x） （2）出栈---pop()
 */
public class Stack {
    private int[]stack =new int[5];//定义数组
    private int p;//定义变量---指向栈顶
    //构造方法：初始化某些变量
    public Stack(){
        p = -1;
    }
    public void push(int x){
        if(p == 4){
            System.out.println("栈已经满了！");
        }else{
            stack[++p] = x;
        }
    }
    public int pop(){
        if(p<0){
            System.out.println("栈已经空了！");
            return 0;
        }else{
            return stack[p--];
        }
    }
}
