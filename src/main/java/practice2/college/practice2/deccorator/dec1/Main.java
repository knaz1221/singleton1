package practice2.college.practice2.deccorator.dec1;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier(new SMSNotifier(new BaseNotifier()));
        QueueController queue = new QueueController(notifier);

        queue.addRequest(new QueueRequest(1, "Ivan", QueuePriority.HIGH));
        queue.addRequest(new QueueRequest(2, "Maria", QueuePriority.NORMAL));
    }
}
