package practice2.college.practice2.deccorator.dec1;

public class BaseNotifier implements Notifier {
    @Override
    public void notify(QueueRequest request) {
        System.out.println("Notification for " + request.getUser());
    }
}
