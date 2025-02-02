package practice2.college.practice2.visitor;

public class BankDatabaseVisitor implements BankVisitor {
    @Override
    public String visitUser(User user) {
        return "Visit users ( " + user.toString() + " );";
    }

    @Override
    public String visitAdministrator(Admin admin) {
        return "Visit administrators ( " + admin.toString() + " );";
    }

    @Override
    public String visitBankAccount(BankAcc account) {
        return "Visit bank accounts ( Client: " + account.getClient() + ", Admin: " + account.getAdmin() + " );";
    }

    @Override
    public String visitInternalAccount(InternalAccount account) {
        return "Visit internal accounts  ( " + account.getName() + " );";
    }
}