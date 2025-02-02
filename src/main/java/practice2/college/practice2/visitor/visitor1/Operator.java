package practice2.college.practice2.visitor.visitor1;

public class Operator extends QueueEntity {
    private String department;

    public Operator(long id, String department) {
        super(id);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Operator in " + department;
    }

    @Override
    public String accept(QueueVisitor visitor) {
        return visitor.visitOperator(this);
    }
}
