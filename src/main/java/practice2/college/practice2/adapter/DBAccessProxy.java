package practice2.college.practice2.adapter;

public class DBAccessProxy {
    private final IDatabaseDriverAdapter dbAdapter;

    public DBAccessProxy(IDatabaseDriverAdapter dbAdapter) {
        this.dbAdapter = dbAdapter;
    }

    public String[] executeQueryWithNumbers(String query) {
        return dbAdapter.executeQueryWithNumbers(query);
    }

    public void executeQuery(String query) {
        dbAdapter.executeQuery(query);
    }

    public boolean checkDatabaseStatus() {
        return dbAdapter.checkDatabaseStatus();
    }

    public void commit() {
        dbAdapter.commit();
    }

    public void rollback() {
        dbAdapter.rollback();
    }
}
