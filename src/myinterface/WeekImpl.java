package myinterface;

/**
 * Created by Administrator on 2017-4-21.
 */
public class WeekImpl implements Week{
    public void show(int x){
        switch (x){
            case  MON:
                System.out.println("星期一");break;
            case  TUE:
                System.out.println("星期二");break;
            case  WED:
                System.out.println("星期三");break;
            case  THU:
                System.out.println("星期四");break;
            case  FRI:
                System.out.println("星期五");break;
            case  SAT:
                System.out.println("星期六");break;
            case  SUN:
                System.out.println("星期日");break;
        }
    }
}
