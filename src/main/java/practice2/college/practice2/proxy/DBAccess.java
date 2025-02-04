package practice2.college.practice2.proxy;

public class DBAccess implements DatabaseAccessProxy {
    private String url;
    private boolean isOpen;

    public DBAccess(String url) {
        this.url = url;
        this.isOpen = false;
    }

    @Override
    public String executeQuery(int lineNumber) {
        return "Executing query on line: " + lineNumber;
    }

    @Override
    public void executeQueryNoResult(int lineNumber) {
        System.out.println("Executing query without result on line: " + lineNumber);
    }

    @Override
    public boolean checkDatabaseStatus() {
        return isOpen;
    }

    @Override
    public String open() {
        isOpen = true;
        return "Database connection opened.";
    }

    @Override
    public void close() {
        isOpen = false;
        System.out.println("Database connection closed.");
    }

    @Override
    public void commit() {
        System.out.println("Transaction committed.");
    }

    @Override
    public void rollback() {
        System.out.println("Transaction rolled back.");
    }
}