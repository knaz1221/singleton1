package practice2.college.practice2.visitor;

public interface BankVisitor {
    String visitUser(User user);
    String visitAdministrator(Admin admin);
    String visitBankAccount(BankAcc account);
    String visitInternalAccount(InternalAccount account);
}
