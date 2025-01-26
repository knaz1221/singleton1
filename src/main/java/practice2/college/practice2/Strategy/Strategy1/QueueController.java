package practice2.college.practice2.Strategy.Strategy1;

public class QueueController {
    private Ticket ticket;
    private QueueStrategy queueStrategy;

    public QueueController(Ticket ticket) {
        this.ticket = ticket;
    }

    public void setQueueStrategy(QueueStrategy strategy) {
        this.queueStrategy = strategy;
    }

    public void assignTicket() {
        if (queueStrategy != null) {
            queueStrategy.assignTicket(ticket);
        }
    }

    public void notifyUser(Client client) {
        if (queueStrategy != null) {
            queueStrategy.notifyUser(client);
        }
    }

    public void completeService() {
        if (queueStrategy != null) {
            queueStrategy.completeService(ticket);
        }
    }
}
