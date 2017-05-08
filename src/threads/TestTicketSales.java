package threads;

/**
 * Created by Administrator on 2017/5/8.
 */
public class TestTicketSales {
    public static void main(String[] args) {
        TicketWindow ticketWindow = new TicketWindow();
        Thread window1 = new Thread(ticketWindow,"窗口1");
        Thread window2 = new Thread(ticketWindow,"窗口2");
        Thread window3 = new Thread(ticketWindow,"窗口3");
        Thread window4 = new Thread(ticketWindow,"窗口4");
        Thread window5 = new Thread(ticketWindow,"窗口5");

        window1.start();
        window2.start();
        window3.start();
        window4.start();
        window5.start();
    }



}
