package practice2.college.practice2.adapter.adapter1;

public class Main {
    public static void main(String[] args) {
        QueueDatabaseAdapter mySQLAdapter = new MySQLQueueAdapter();
        QueueAccessProxy proxy = new QueueAccessProxy(mySQLAdapter);
        QueueController controller = new QueueController(proxy);

        controller.addPerson("Rick  ");
        controller.processNext();
    }
}