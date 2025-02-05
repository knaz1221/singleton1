package practice2.college.practice2.adapter;

public interface IDatabaseDriverAdapter {
    String[] executeQueryWithNumbers(String query);
    void executeQuery(String query);
    boolean checkDatabaseStatus();
    void commit();
    void rollback();
}