package practice2.college.practice2.deccorator;

public class SystemLogWrapper extends AbstractWrapper {
    private String journalName;

    public SystemLogWrapper(NotificationWrapper wrapper, String journalName) {
        super(wrapper);
        this.journalName = journalName;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Logging to SysLog [" + journalName + "]: " + alert.getMessage());
        super.notify(alert);
    }
}
