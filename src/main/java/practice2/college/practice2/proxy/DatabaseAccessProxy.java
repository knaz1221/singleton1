package practice2.college.practice2.proxy;

public interface DatabaseAccessProxy {
    String executeQuery(int lineNumber);
    void executeQueryNoResult(int lineNumber);
    boolean checkDatabaseStatus();
    String open();
    void close();
    void commit();
    void rollback();
}
