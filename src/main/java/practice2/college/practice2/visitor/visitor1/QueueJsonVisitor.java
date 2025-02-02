package practice2.college.practice2.visitor.visitor1;

public class QueueJsonVisitor implements QueueVisitor {
    @Override
    public String visitCustomer(Customer customer) {
        return "Customer: " + customer.toString() ;
    }

    @Override
    public String visitOperator(Operator operator) {
        return "Operator: " + operator.toString() ;
    }

    @Override
    public String visitQueue(Queue queue) {
        return "Queue: " + queue.getQueueNumber() ;
    }
}
