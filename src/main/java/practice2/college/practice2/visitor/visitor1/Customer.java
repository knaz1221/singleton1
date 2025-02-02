package practice2.college.practice2.visitor.visitor1;

public class Customer extends QueueEntity {
    private String name;
    private String serviceNeeded;

    public Customer(long id, String name, String serviceNeeded) {
        super(id);
        this.name = name;
        this.serviceNeeded = serviceNeeded;
    }

    @Override
    public String toString() {
        return name + " (Service: " + serviceNeeded + ")";
    }

    @Override
    public String accept(QueueVisitor visitor) {
        return visitor.visitCustomer(this);
    }
}
