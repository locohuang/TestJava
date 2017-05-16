package string;

import java.text.DecimalFormat;
import java.text.Format;

/**
 * Created by Administrator on 2017-5-16.
 */
public class TestFormat {
    public static void main(String[] args) {
        double dvalue = 123.3456;
        Format decimalFormat = new DecimalFormat("￥00.00");
        System.out.println(decimalFormat.format(dvalue));
    }
}
