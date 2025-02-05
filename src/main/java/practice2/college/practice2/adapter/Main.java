package practice2.college.practice2.adapter;

public class Main {
    public static void main(String[] args) {
        IDatabaseDriverAdapter mySQLAdapter = new MySQLDatabaseAdapter();
        DBAccessProxy proxy = new DBAccessProxy(mySQLAdapter);
        DatabaseController controller = new DatabaseController(proxy);
        controller.executeQuery("SELECT * FROM queue");
        controller.executeQueryWithNumbers("SELECT id FROM queue");
    }
}

