package practice2.college.practice2.Strategy.Strategy1;

public class GeneralQueue implements QueueStrategy {
    @Override
    public void assignTicket(Ticket ticket) {
        System.out.println("Assigning ticket in General Queue: " + ticket.getTicketNumber());
    }
    @Override
    public void notifyUser(Client user) {
        System.out.println("Notifying user in General Queue: " + user);
    }
    @Override
    public void completeService(Ticket ticket) {
        System.out.println("Completing service for ticket in General Queue: " + ticket.getTicketNumber());
    }
}
