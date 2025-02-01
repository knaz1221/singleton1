package practice2.college.practice2.deccorator.dec1;

public class SMSNotifier extends BaseNotifier {
    private Notifier notifier;

    public SMSNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void notify(QueueRequest request) {
        notifier.notify(request);
        System.out.println("SMS sent to " + request.getUser() + ".");
    }
}
