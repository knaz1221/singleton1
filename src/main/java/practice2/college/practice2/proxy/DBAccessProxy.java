package practice2.college.practice2.proxy;

public class DBAccessProxy implements DatabaseAccessProxy {
    private DBAccess dbAccess;

    public DBAccessProxy(DBAccess dbAccess) {
        this.dbAccess = dbAccess;
    }

    @Override
    public String executeQuery(int lineNumber) {
        long startTime = System.currentTimeMillis();
        String result = dbAccess.executeQuery(lineNumber);
        long endTime = System.currentTimeMillis();
        System.out.println("Time elapsed: " + (endTime - startTime) + " ms");
        return result;
    }

    @Override
    public void executeQueryNoResult(int lineNumber) {
        long startTime = System.currentTimeMillis();
        dbAccess.executeQueryNoResult(lineNumber);
        long endTime = System.currentTimeMillis();
        System.out.println("Time elapsed: " + (endTime - startTime) + " ms");
    }

    @Override
    public boolean checkDatabaseStatus() {
        return dbAccess.checkDatabaseStatus();
    }

    @Override
    public String open() {
        return dbAccess.open();
    }

    @Override
    public void close() {
        dbAccess.close();
    }

    @Override
    public void commit() {
        dbAccess.commit();
    }

    @Override
    public void rollback() {
        dbAccess.rollback();
    }
}
