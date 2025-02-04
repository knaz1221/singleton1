package practice2.college.practice2.proxy;

public class Main {
    public static void main(String[] args) {
        DBAccess realDatabase = new DBAccess("mysql//localhost:3306/mydb");
        DatabaseAccessProxy proxy = new DBAccessProxy(realDatabase);
        DatabaseController controller = new DatabaseController(proxy);
        System.out.println(proxy.open());
        proxy.executeQuery(1);
        proxy.executeQueryNoResult(2);
        controller.addClient();
        controller.addOrder();
        proxy.commit();
        proxy.close();
    }
}
