package practice2.college.practice2.deccorator.dec1;

import java.util.ArrayList;

public class QueueController {
    private Notifier notifier;
    private ArrayList<QueueRequest> queue = new ArrayList<>();

    public QueueController(Notifier notifier) {
        this.notifier = notifier;
    }

    public void addRequest(QueueRequest request) {
        queue.add(request);
        System.out.println("Request added: " + request.getId() + " from " + request.getUser() + ".");
        notifier.notify(request);
    }
}