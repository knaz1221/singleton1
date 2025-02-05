package practice2.college.practice2.adapter;

public class DatabaseController {
    private final DBAccessProxy dbAccessProxy;

    public DatabaseController(DBAccessProxy dbAccessProxy) {
        this.dbAccessProxy = dbAccessProxy;
    }

    public void executeQuery(String query) {
        dbAccessProxy.executeQuery(query);
    }

    public void executeQueryWithNumbers(String query) {
        String[] results = dbAccessProxy.executeQueryWithNumbers(query);
        for (String result : results) {
            System.out.println("Query result: " + result);
        }
    }
}
