package practice2.college.practice2.observer.observer1;

public class Main {
    public static void main(String[] args) {
        QueueController queueController = new QueueController();
        User user1 = new User("1", "Alice", "+380645231888");
        User user2 = new User("2", "Bob", "+380995318214");
        QueueItem item1 = new QueueItem("item1", user1);
        QueueItem item2 = new QueueItem("item2", user2);
        EmailNotifier emailNotifier = new EmailNotifier("example@gmail.com");
        SMSNotifier smsNotifier = new SMSNotifier("+380251118778");
        queueController.subscribe(emailNotifier);
        queueController.subscribe(smsNotifier);
        queueController.addToQueue(item1);
        queueController.addToQueue(item2);
        System.out.println(queueController.getQueueStatus());
        queueController.removeFromQueue("item1");
        System.out.println(queueController.getQueueStatus());
    }
}