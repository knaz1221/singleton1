package practice2.college.practice2.visitor;

import java.util.ArrayList;

public class AccountStorage {
    private ArrayList<Accountable> accountInfo = new ArrayList<>();
    private BankVisitor serializer;

    public void save() {
        for (var acc : accountInfo) {
            String out = acc.accept(serializer);
            System.out.println(out);
        }
    }

    public void changeFormat(String format) {
        if (format.equals("DB")) {
            serializer = new BankDatabaseVisitor();
        } else {
            serializer = new BankJsonVisitor();
        }
    }

    public void addAccount(Accountable account) {
        accountInfo.add(account);
    }
}
