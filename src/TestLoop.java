import java.util.Scanner;

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
        /*for(int i=0;i<10; i++){
            System.out.println(i);
            if(i%2!=0) {
                continue;
            }
            System.out.print(i+"  ");
        }*/
        //判断一个数是否为素数(2  3  5  7 11 13  17  ....):除1和本身，其它所有数都不能整除

        //7   7%1  0    7%7  0   7%2 1   7%3 1  7%4 3  7%5 2  7%6 1
        //输入一个整数：Scanner
        int v;
        Scanner scanner = new Scanner(System.in);

        /*if(v%2==0) {
            System.out.println(v+"不是素数");
        }
        else if(v%3==0) {
            System.out.println(v+"不是素数");
        }
        else if(v%4==0) {
            System.out.println(v+"不是素数");
        }
        else if(v%5==0) {
            System.out.println(v+"不是素数");
        }
        else if(v%6==0) {
            System.out.println(v+"不是素数");
        }else{
            System.out.println(v+"素数");
        }*/
       /* int flag=0;
        if(v%2==0) {
            flag=1;
        }
        if(v%3==0) {
            flag=1;
        }
        if(v%4==0) {
            flag=1;
        }
        if(v%5==0) {
            flag=1;
        }
        if(v%6==0) {
            flag=1;
        }
        if(flag==1){
            System.out.println(v+"不是素数");
        }else {
            System.out.println(v+"素数");
        }*/
        /*while(true) {
            System.out.println("输入负数结束！");
            v=scanner. nextInt();
            if(v<0){
                break;
            }
            int i, flag = 0;
            for (i = 2; i < v; i++) {
                if (v % i == 0) {
                    flag = 1;
                }
            }
            if (flag == 1) {
                System.out.println(v + "不是素数");
            } else {
                System.out.println(v + "素数");
            }
        }*/
        int[] arr =new int[]{1,2,3,4,5,6};
        int[][]arr2 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        /*System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);*/
        /*for(int i=0;i<6;i++){
            System.out.print(arr[i]+ "  ");
        }*/
        /*for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr2[i][j]+ "  " );
            }
            System.out.println();
        }*/
        /*System.out.print(arr2[0][0]+"  ");
        System.out.print(arr2[0][1]+"  ");
        System.out.print(arr2[0][2]+"  ");
        System.out.println();
        System.out.print(arr2[1][0]+"  ");
        System.out.print(arr2[1][1]+"  ");
        System.out.print(arr2[1][2]+"  ");
        System.out.println();
        System.out.print(arr2[2][0]+"  ");
        System.out.print(arr2[2][1]+"  ");
        System.out.print(arr2[2][2]+"  ");
        System.out.println();*/


        /*for(int k=0;k<3;k++) {
            System.out.print(arr2[0][k] + "  ");
        }
        System.out.println();

        for(int k=0;k<3;k++) {
            System.out.print(arr2[1][k] + "  ");
        }
        System.out.println();
        for(int k=0;k<3;k++) {
            System.out.print(arr2[2][k] + "  ");
        }
        System.out.println();*/
        /*for(int m=0;m<3;m++){
            for(int k=0;k<3;k++) {
                System.out.print(arr2[m][k] + "  ");
            }
            System.out.println();
        }*/
        /*for(int x:arr){
            System.out.println(x);
        }*/
        for(int[]xa:arr2){
            for(int x:xa){
                System.out.print(x+"  ");
            }
            System.out.println();
        }
    }
}
