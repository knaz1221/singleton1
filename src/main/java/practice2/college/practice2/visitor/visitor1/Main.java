package practice2.college.practice2.visitor.visitor1;

public class Main {
    public static void main(String[] args) {
        QueueStorage storage = new QueueStorage();
        QueueDatabaseVisitor queueDatabaseVisitor = new QueueDatabaseVisitor();

        Customer customer1 = new Customer(1, "Alice", "Banking");
        Operator operator1 = new Operator(2, "ArrayList");
        Queue queue1 = new Queue(3, 101);
        System.out.println(queueDatabaseVisitor.visitQueue(queue1));
        System.out.println(queueDatabaseVisitor.visitCustomer(customer1));
        System.out.println(queueDatabaseVisitor.visitOperator(operator1));

        storage.addEntity(customer1);
        storage.addEntity(operator1);
        storage.addEntity(queue1);

        storage.changeFormat("JSON");
        storage.save();
    }
}

