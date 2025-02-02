package practice2.college.practice2.visitor;

import java.time.LocalDateTime;

public abstract class Accountable {
    protected long id;
    protected LocalDateTime creationDate;

    public Accountable(long id) {
        this.id = id;
        this.creationDate = LocalDateTime.now();
    }

    public abstract String accept(BankVisitor visitor);
}
