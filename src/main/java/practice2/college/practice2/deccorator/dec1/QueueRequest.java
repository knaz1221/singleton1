package practice2.college.practice2.deccorator.dec1;

public class QueueRequest {
    private int id;
    private String user;
    private QueuePriority priority;

    public QueueRequest(int id, String user, QueuePriority priority) {
        this.id = id;
        this.user = user;
        this.priority = priority;
    }

    public int getId() { return id; }
    public String getUser() { return user; }
    public QueuePriority getPriority() { return priority; }
}
