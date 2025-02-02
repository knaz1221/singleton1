package practice2.college.practice2.visitor.visitor1;

import java.time.LocalDateTime;

public abstract class QueueEntity {
    private long id;
    private LocalDateTime creationDate;

    public QueueEntity(long id) {
        this.id = id;
        this.creationDate = LocalDateTime.now();
    }

    public abstract String accept(QueueVisitor visitor);
}
