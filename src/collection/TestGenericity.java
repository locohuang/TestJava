package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017-5-26.
 */
public class TestGenericity {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        //list.add("abc");
        list.add(4);
        int sum = 0;
        System.out.println(list);
       /* for (Object o : list){
            sum = sum+ Integer.parseInt(o.toString());
            System.out.println(sum);
        }*/
        for(int i : list){
            sum = sum+ i;
        }
        System.out.println(sum);
        System.out.println("_______________________________________");
        System.out.println(getTValue("haha"));
        System.out.println(getTValue(3));
        System.out.println(getTValue(true));

}

    public static String getValue(String str){
        return str;
    }
    public static int getValue(int str){
        return str;
    }
    public static boolean getValue(boolean str){
        return str;
    }
    //定义泛型方法  <T>
    public static <T> T getTValue(T t){
        return t;
    }

}
