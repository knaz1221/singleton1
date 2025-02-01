package practice2.college.practice2.deccorator;

public abstract class AbstractWrapper implements NotificationWrapper {
    protected NotificationWrapper wrapper;

    public AbstractWrapper(NotificationWrapper wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void notify(SystemAlert alert) {
        if (wrapper != null) {
            wrapper.notify(alert);
        }
    }
}
