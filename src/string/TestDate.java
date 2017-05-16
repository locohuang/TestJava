package string;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2017-5-16.
 */
public class TestDate {
    public static void main(String[] args) {
        //jdk8以前
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        System.out.println(dateFormat.format(date.getTime()));
        System.out.println(date.getYear()+1900 +"   "  + (date.getMonth() +1) +  "    " + date.getDate());
        System.out.println("_______________________________________________________________________");
        Calendar calendar = Calendar.getInstance();
        Date date2 =calendar.getTime();
        long dateTime = calendar.getTimeInMillis();
        System.out.println(dateFormat.format(date2));
        System.out.println(calendar.get(Calendar.YEAR) +"   "  +( calendar.get(Calendar.MONTH) +1) +  "    " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("_______________________________________________________________________");
        //jdk8  日期     时间      日期时间
        LocalDate localDate = LocalDate.now();
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(formatter2.format(localDate));
        LocalTime localTime = LocalTime.now();
        //DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern(" hh:mm:ss");
        DateTimeFormatter timeFormatter2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(timeFormatter2.format(localTime));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDate.getYear() +"   "  +localDate.getMonthValue() +  "    " + localDate.getDayOfMonth());
    }
}
