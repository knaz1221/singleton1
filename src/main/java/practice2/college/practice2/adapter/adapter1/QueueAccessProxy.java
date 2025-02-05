package practice2.college.practice2.adapter.adapter1;

public class QueueAccessProxy {
    private final QueueDatabaseAdapter queueAdapter;

    public QueueAccessProxy(QueueDatabaseAdapter queueAdapter) {
        this.queueAdapter = queueAdapter;
    }

    public String[] getNextInQueue() {
        return queueAdapter.getNextInQueue();
    }

    public void addPersonToQueue(String person) {
        queueAdapter.addPersonToQueue(person);
    }

    public boolean checkQueueStatus() {
        return queueAdapter.checkQueueStatus();
    }

    public void commit() {
        queueAdapter.commit();
    }

    public void rollback() {
        queueAdapter.rollback();
    }
}
