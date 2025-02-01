package practice2.college.practice2.deccorator;

public class PhoneWrapper extends AbstractWrapper {
    private String phoneNumber;

    public PhoneWrapper(NotificationWrapper wrapper, String phoneNumber) {
        super(wrapper);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Sending SMS to phone " + phoneNumber + alert.getMessage());
        super.notify(alert);
    }
}