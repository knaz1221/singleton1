package practice2.college.practice2.proxy;

public class DatabaseController {
    private DatabaseAccessProxy dbHandler;

    public DatabaseController(DatabaseAccessProxy dbHandler) {
        this.dbHandler = dbHandler;
    }

    public void addClient() {
        System.out.println("Adding client...");
    }

    public void removeClient() {
        System.out.println("Removing client...");
    }

    public void modifyOrder() {
        System.out.println("Modifying order...");
    }

    public void addOrder() {
        System.out.println("Adding order...");
    }

    public void removeOrder() {
        System.out.println("Removing order...");
    }
}
