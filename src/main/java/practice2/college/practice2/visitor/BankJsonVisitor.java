package practice2.college.practice2.visitor;

public class BankJsonVisitor implements BankVisitor {
    @Override
    public String visitUser(User user) {
        return "User " + user.toString() ;
    }

    @Override
    public String visitAdministrator(Admin admin) {
        return "Administrator: " + admin.toString() ;
    }

    @Override
    public String visitBankAccount(BankAcc account) {
        return "BankAccount - Client: " + account.getClient() + ", Admin: " + account.getAdmin() ;
    }

    @Override
    public String visitInternalAccount(InternalAccount account) {
        return "InternalAccount: " + account.getName() ;
    }
}