package practice2.college.practice2.builder.builder2;

public abstract class QueueBuilder {
    public QueueBuilder() {
    }

    abstract void set_queueName(String _queueName);
    abstract void set_queueType(String _queueType);
    abstract void set_maxCapacity(int _maxCapacity);
    abstract void build();
    public abstract String get_queueName();
    public abstract String get_queueType();
    public abstract int get_maxCapacity();
}
