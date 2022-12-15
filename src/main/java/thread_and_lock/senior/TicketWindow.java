package thread_and_lock.senior;

public class TicketWindow implements Runnable {

    @Override
    public void run() {

        Ticket nextTicket = TicketUtil.getNextTicket();

        while (nextTicket.getId() > 0) {
            System.out.println(Thread.currentThread().getName() + "---- sold " + nextTicket.getTicketNo());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            nextTicket = TicketUtil.getNextTicket();
        }


    }
}
