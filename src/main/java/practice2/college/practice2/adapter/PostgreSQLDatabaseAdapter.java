package practice2.college.practice2.adapter;

public class PostgreSQLDatabaseAdapter implements IDatabaseDriverAdapter {
    @Override
    public String[] executeQueryWithNumbers(String query) {
        System.out.println("Executing PostgreSQL query with numbers: " + query);
        return new String[]{"PG_Result1", "PG_Result2"};
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing PostgreSQL query: " + query);
    }

    @Override
    public boolean checkDatabaseStatus() {
        System.out.println("Checking PostgreSQL database status");
        return true;
    }

    @Override
    public void commit() {
        System.out.println("Committing PostgreSQL transaction");
    }

    @Override
    public void rollback() {
        System.out.println("Rolling back PostgreSQL transaction");
    }
}
