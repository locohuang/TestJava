package string;

/**
 * Created by Administrator on 2017-5-16.
 */
public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("abc");
        builder.append("123");
        builder.insert(3,"aabbcc");
        builder.deleteCharAt(3);
        System.out.println(builder.toString());
        //用String定义字符串对象"abc123ab"，删除其中的某些字符(123)
        StringBuffer buffer = new StringBuffer();
        buffer.append("abc");
        buffer.append("123");
        buffer.insert(3,"aabbcc");
        buffer.deleteCharAt(3);
        System.out.println(buffer.toString());

    }
}
