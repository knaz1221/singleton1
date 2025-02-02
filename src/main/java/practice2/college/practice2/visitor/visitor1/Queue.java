package practice2.college.practice2.visitor.visitor1;

public class Queue extends QueueEntity {
    private int queueNumber;

    public Queue(long id, int queueNumber) {
        super(id);
        this.queueNumber = queueNumber;
    }

    public int getQueueNumber() {
        return queueNumber;
    }

    @Override
    public String accept(QueueVisitor visitor) {
        return visitor.visitQueue(this);
    }
}
