package threads;

/**
 * Created by Administrator on 2017/5/8.
 */
public class TicketResource {
    private static int ticketCount = 100;
    //同步方法
    public static synchronized int sale(){
        return ticketCount--;
    }
    /*  同步代码块
        synchronized (this){
            代码
        }

     */
    public static int currentTicket(){
        return ticketCount;
    }
}
