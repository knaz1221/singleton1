package practice2.college.practice2.Strategy.Strategy1;

public interface QueueStrategy {
    void assignTicket(Ticket ticket);
    void notifyUser(Client client);
    void completeService(Ticket ticket);
}
