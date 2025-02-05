package practice2.college.practice2.adapter;

public class MySQLDatabaseAdapter implements IDatabaseDriverAdapter {
    @Override
    public String[] executeQueryWithNumbers(String query) {
        System.out.println("Executing MySQL query with numbers: " + query);
        return new String[]{"Result1", "Result2"};
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing MySQL query: " + query);
    }

    @Override
    public boolean checkDatabaseStatus() {
        System.out.println("Checking MySQL database status");
        return true;
    }

    @Override
    public void commit() {
        System.out.println("Committing MySQL transaction");
    }

    @Override
    public void rollback() {
        System.out.println("Rolling back MySQL transaction");
    }
}
