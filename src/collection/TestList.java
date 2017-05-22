package collection;

import java.util.*;

/**
 * Created by Administrator on 2017/5/22.
 */
public class TestList {
    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        aList.add("one");
        aList.add("three");
        aList.add("123");
        System.out.println(aList.size());
        System.out.println(aList.get(1));
        aList.add(1,"two");
        aList.set(3,"abc");
        aList.remove(0);
        System.out.println(aList.size());
        System.out.println(aList.get(1));
        System.out.println(aList);
        System.out.println("________________________________________");
        //for
        for(int i = 0;i<aList.size();i++){
            System.out.print(aList.get(i)+"   ");
        }
        System.out.println();

        System.out.println("________________________________________");
        //foreach
        for(String s:aList){
            System.out.print(s+"   ");
        }
        System.out.println();
        System.out.println("________________________________________");

        Iterator<String> iterator = aList.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.print(s+"   ");
        }
        System.out.println();

        //ListIterator<String> iterable = aList.listIterator();

        /*List<String> bList = null;
        if(bList!=null)
            System.out.println(bList.size());*/
        List<String> list = new LinkedList<>();
    }
}
