package threads;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2017-5-2.
 */
public class TestDate {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        System.out.println(sdFormat.format(calendar.getTime()));
        System.out.println(sdFormat.format(calendar.getTimeInMillis()));
    }
}
