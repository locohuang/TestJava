import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/6.
 */
public class TestIf {
    public static void main(String[] args) {
        int a=30,b=30;
       /* if(a>b){
            System.out.println(a>b);
            System.out.println("a>b");
        }
        */
        /*if (a>b){
            System.out.println(a>b);
            System.out.println("a>b");
        }else{
            System.out.println(a>b);
            System.out.println("a<=b");
        }*/

       if (a>b){
            System.out.println("a>b");
        }else{
            if(a==b){
                System.out.println("a==b");
            }else{
                System.out.println("a<b");
            }
        }
        //char ch='A';
        int c;
        Scanner scanner = new Scanner(System.in);
        c= scanner.nextInt();
        switch(c){
            /*case 'a':
            case 'A':
                System.out.println('a');break;*/
            case 1:
                System.out.println(1);break;
            case 2:
                System.out.println(2);break;
            case 3:
                System.out.println(3);break;
            default:
                System.out.println("不合法数字！");
        }

    }
}
