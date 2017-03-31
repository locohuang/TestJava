/**
 * Created by Administrator on 2017-3-31.
 */
public class TestString {
    public static void main(String[] args) {
        String st1 = "abc123";
        String st2 = new String();
        String st3 = new String("abc123");
        char[]chs = new char[]{'a','b','c','4','5','6'};
        String st4 = new String(chs);

        System.out.println("st1:"+st1);
        System.out.println("st2:"+st2);
        System.out.println("st3:"+st3);
        System.out.println("st4:"+st4);
        //获取字符串长度
        System.out.println(st1.length());
        //获取某个字符
        System.out.println(st1.charAt(3));
        //根据单个字符显示位置
        System.out.println(st1.indexOf('c'));
        System.out.println(st1.indexOf("bc"));
        //字符串比较
        System.out.println(st1==st3);
        System.out.println(st1.equals(st3));

    }
}
