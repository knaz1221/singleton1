package practice2.college.practice2.visitor.visitor1;

public class QueueDatabaseVisitor implements QueueVisitor {
    @Override
    public String visitCustomer(Customer customer) {
        return "Visit Customers ( " + customer.toString() + " );";
    }

    @Override
    public String visitOperator(Operator operator) {
        return "Visit Operators ( " + operator.toString() + " );";
    }

    @Override
    public String visitQueue(Queue queue) {
        return "Visit Queues ( " + queue.getQueueNumber() + " );";
    }
}
