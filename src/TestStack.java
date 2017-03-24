import java.util.Random;

/**
 * Created by Administrator on 2017-3-24.
 */
public class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
       /* stack.push(4);
        stack.push(6);
        stack.push(8);

        System.out.println(stack.pop());
        stack.push(10);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());*/
        Random random = new Random();
        int r;
        for(int i=0;i<5;i++){
            r = random.nextInt(20);
            stack.push(r);
            System.out.println(r);
        }
        stack.push(100);
        for(int i=1;i<=5;i++){
            System.out.println( stack.pop());
        }
    }
}
