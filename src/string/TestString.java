package string;

import sun.misc.Cleaner;

import java.util.*;

/**
 * Created by Administrator on 2017-5-12.
 */
public class TestString {
    public static void main(String[] args) {
        //定义字符串：
        String str1 = "Hello Java";
        String str2 = new String();
        String str3 = new String("I like java");
        char[] chs = new char[]{'a', 'b', 'c', 'd', 'e'};
        String str4 = new String(chs);
        String str5 = new String(chs, 3, 2);
        byte[] bytes = new byte[]{65,66,67,68,69,70};
        String str6 = new String(bytes);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println("__________________________________________________________");
        //字符串转换
        String sourceStr = "HelloJava";
        char[] targetArray = sourceStr.toCharArray();
        for(char c:targetArray){
            System.out.print(c+"   ");
        }
        System.out.println();
        char[] targetArray2 = new char[100];
        sourceStr.getChars(5,9,targetArray2,5);
        for(char c:targetArray2){
            System.out.print(c+"   ");
        }
        System.out.println("__________________________________________________________");
        //字符串的比较 ==  equals   compareTo
        System.out.println("__________________________________________________________");
        String mystr1 = new String("I like Java");
        String mystr2 = new String("I like java");
        System.out.println(mystr1==mystr2);
        System.out.println(mystr1.equals(mystr2));
        System.out.println(mystr1.equalsIgnoreCase(mystr2));
        String mystr3 = new String("afcde");
        String mystr4 = new String("abcde");
        System.out.println(mystr3.compareTo(mystr4));
        //练习：有字符串数组，将字符串数组按字母表顺序从小到大排序
        //String[]names = new String[]{"zhang","li","wang","sun","zhao","haung"};

        //字符查找
        System.out.println("__________________________________________________________");
        String search = new String("i like  likeJaia");
        System.out.println(search.indexOf('i'));
        System.out.println(search.lastIndexOf('i'));
        System.out.println(search.indexOf("like"));
        System.out.println(search.lastIndexOf("like"));
        System.out.println(search.charAt(2));
        System.out.println(search.contains("like"));

        //取字串
        System.out.println(search.substring(2,6));
        //有文件名：abc.abf.doc ，给他重命名，名字是：xxxx.doc   xxxx是随机数
        //辅助：indexOf   substring    split  (Random,系统时间，UUID)
        System.out.println("__________________________________________________________");
        String fileName = new String("hah.abcd.mp4");
        //String ex = fileName.substring(3);
        //String ex = fileName.substring(fileName.indexOf('.'));//适合文件名为：abcd.mp4，不适合：hah.abcd.mp4
        String ex = fileName.substring(fileName.lastIndexOf('.'));//适合文件名为：abcd.mp4，hah.abcd.mp4
        /*Random random = new Random();
        String newFileName = String.valueOf(Calendar.getInstance().getTimeInMillis())+random.nextInt(10000)+ex;*/
        String uuid = UUID.randomUUID().toString();
        String newFileName = uuid+ex;
        System.out.println(newFileName);

        System.out.println("__________________________________________________________");
        //练习：有字符串数组，将字符串数组按字母表顺序从小到大排序
        String[]names = new String[]{"zhang","li","wang","sun","Zhao","haung"};
        System.out.println("排序前：");
        for(String s : names){
            System.out.print(s+"    ");
        }
        System.out.println();
        //Arrays ;Collections
        //Arrays.sort(names);//按字符串大小从小到大排序---改变了数组元素的位置
        //Arrays.sort(names, Collections.reverseOrder());//按降序方式进行排序
        Arrays.sort(names,Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        System.out.println("排序后：");
        for(String s : names){
            System.out.print(s+"    ");
        }
        System.out.println();









    }
}
