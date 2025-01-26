package practice2.college.practice2.Strategy.Strategy1;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket("T001", LocalDateTime.now(), "Consultation");
        QueueController qcController = new QueueController(ticket);

        String serviceType = "priority"; // Example: change to "general" or "self-service" for testing

        if (serviceType.equalsIgnoreCase("general")) {
            qcController.setQueueStrategy(new GeneralQueue());
        } else if (serviceType.equalsIgnoreCase("priority")) {
            qcController.setQueueStrategy(new PriorityQueue());
        } else if (serviceType.equalsIgnoreCase("self-service")) {
            qcController.setQueueStrategy(new ServiceQueue());
        }

        Client client= new Client("John", "Doe");

        qcController.assignTicket();
        qcController.notifyUser(client);
        qcController.completeService();
    }
}
