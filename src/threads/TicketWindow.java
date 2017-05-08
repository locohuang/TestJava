package threads;

/**
 * Created by Administrator on 2017/5/8.
 */
public class TicketWindow implements Runnable{
    @Override
    public void run() {

            while (TicketResource.currentTicket() > 0) {
                System.out.println(Thread.currentThread().getName() + "售票:" + TicketResource.sale());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

    }
}
