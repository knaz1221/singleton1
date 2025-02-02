package practice2.college.practice2.visitor;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        AccountStorage storage = new AccountStorage();
        User user = new User(1, "Rick", "Finc", LocalDateTime.of(1990, 5, 15, 0, 0), new Addres("USA", "California", "Los Angeles", "Main St", "Downtown", "123", "4"));
        Admin admin = new Admin(2, "Finance", LocalDateTime.of(2015, 3, 10, 0, 0));
        BankAcc account = new BankAcc(3, user, admin, 10000, false);
        storage.addAccount(user);
        storage.addAccount(admin);
        storage.addAccount(account);
        storage.changeFormat("JSON");
        storage.save();
    }
}
