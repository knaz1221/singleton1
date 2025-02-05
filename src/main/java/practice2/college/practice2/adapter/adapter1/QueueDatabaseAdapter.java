package practice2.college.practice2.adapter.adapter1;

public interface QueueDatabaseAdapter {
    String[] getNextInQueue();
    void addPersonToQueue(String person);
    boolean checkQueueStatus();
    void commit();
    void rollback();
}
