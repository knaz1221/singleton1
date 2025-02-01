package practice2.college.practice2.deccorator;

public class EmailWrapper extends AbstractWrapper {
    private String uniqueName;

    public EmailWrapper(NotificationWrapper wrapper, String uniqueName) {
        super(wrapper);
        this.uniqueName = uniqueName;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Sending Email to " + uniqueName + ": " + alert.getMessage());
        super.notify(alert);
    }
}