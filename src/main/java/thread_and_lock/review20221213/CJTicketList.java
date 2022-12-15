package thread_and_lock.review20221213;

public class CJTicketList {
    private static int  ticketNo = 10;
    Object object =  new Object();
    public synchronized  int getTicketNo(){
        int currentTickNo = ticketNo;
        if(currentTickNo != 0){
            ticketNo--;
        }
        return currentTickNo;
    }
}
