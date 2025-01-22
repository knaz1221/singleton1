package practice2.college.practice2.Chain.ch2;

public class Terminal extends Queue {
    private int lastTicketNumber = 100;

    @Override
    public void handleRequest(Request request) {
        if ("generateTicket".equals(request.action)) {
            lastTicketNumber++;
            System.out.println("Terminal: Generated ticket number " + lastTicketNumber);
            request.ticketNumber = lastTicketNumber;
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        }
    }
}
