package practice2.college.practice2.visitor;

public class BankAcc extends Accountable {
    private User client;
    private Admin admin;
    private long currentBalance;
    private boolean isCredit;

    public BankAcc(long id, User client, Admin admin, long currentBalance, boolean isCredit) {
        super(id);
        this.client = client;
        this.admin = admin;
        this.currentBalance = currentBalance;
        this.isCredit = isCredit;
    }

    public User getClient() {
        return client;
    }

    public Admin getAdmin() {
        return admin;
    }

    public long getCurrentBalance() {
        return currentBalance;
    }

    public boolean isCredit() {
        return isCredit;
    }

    @Override
    public String accept(BankVisitor visitor) {
        return visitor.visitBankAccount(this);
    }
}
