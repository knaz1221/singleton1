package practice2.college.practice2.adapter;

public class MongoDBDatabaseAdapter implements IDatabaseDriverAdapter {
    @Override
    public String[] executeQueryWithNumbers(String query) {
        System.out.println("Executing MongoDB query with numbers: " + query);
        return new String[]{"Mongo_Result1", "Mongo_Result2"};
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing MongoDB query: " + query);
    }

    @Override
    public boolean checkDatabaseStatus() {
        System.out.println("Checking MongoDB database status");
        return true;
    }

    @Override
    public void commit() {
        System.out.println("Committing MongoDB transaction");
    }

    @Override
    public void rollback() {
        System.out.println("Rolling back MongoDB transaction");
    }
}