package practice2.college.practice2.deccorator.dec1;

public class EmailNotifier extends BaseNotifier {
    private Notifier notifier;

    public EmailNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void notify(QueueRequest request) {
        notifier.notify(request);
        System.out.println("Email sent to " + request.getUser() + ".");
    }
}