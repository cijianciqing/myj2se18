package thread_and_lock.senior;

import java.util.List;

public class TicketUtil {
    public static long ticketCount = 10;
    public static synchronized Ticket getNextTicket(){
        long ticketNo = ticketCount;
        if(ticketCount > 0){
            ticketCount --;
            Ticket ticket = new Ticket();
            ticket.setId(ticketNo);
            ticket.setTicketNo("TicketNo-->"+String.valueOf(ticketNo));
            return ticket;
        }
        return new Ticket();
    }
}
