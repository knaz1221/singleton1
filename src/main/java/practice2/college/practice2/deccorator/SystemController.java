package practice2.college.practice2.deccorator;

public class SystemController {
    private SystemAlert[] alertHistory = new SystemAlert[10];
    private int alertIndex = 0;
    private NotificationWrapper notifier;
    public SystemController(NotificationWrapper notifier) {
        this.notifier = notifier;
    }
    public void addAlert(SystemAlert alert) {
        if (alertIndex < alertHistory.length) {
            alertHistory[alertIndex++] = alert;
        }
        if (notifier != null) {
            notifier.notify(alert);
        }
    }
}