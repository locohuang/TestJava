/**
 * Created by Administrator on 2017-3-7.
 */
public class TestLoop {
    public static void main(String[] args) {
        //System.out.println("**********");
        /*System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");*/
        /*int count=0;
        while(count<5){
            System.out.print("*");
            count++;
        }*/
        /*int count=0;
        do{
            System.out.print("*");
            count++;
        }while(count<5);*/
        /*int count;
        for(count=0;count<5; count++){
            System.out.print("*");
        }*/
        /*for(int count=0;count<5; count++){
            System.out.print("*");
        }*/
        //10以内的偶数显示出来
        for(int i=0;i<10; i++){
            System.out.println(i);
            if(i%2!=0) {
                continue;
            }
            System.out.print(i+"  ");
        }

    }
}
