package practice2.college.practice2.deccorator;

public class TelegramWrapper extends AbstractWrapper {
    private String userId;
    private boolean isAdmin;

    public TelegramWrapper(NotificationWrapper wrapper, String userId, boolean isAdmin) {
        super(wrapper);
        this.userId = userId;
        this.isAdmin = isAdmin;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Sending Telegram message to " + userId + " (Admin: " + isAdmin + "): " + alert.getMessage());
        super.notify(alert);
    }
}