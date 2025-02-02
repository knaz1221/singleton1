package practice2.college.practice2.visitor;

public class InternalAccount extends Accountable {
    private String name;
    private String owner;

    public InternalAccount(long id, String name, String owner) {
        super(id);
        this.name = name;
        this.owner = owner;
    }

    @Override
    public String accept(BankVisitor visitor) {
        return visitor.visitInternalAccount(this);
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }
}
