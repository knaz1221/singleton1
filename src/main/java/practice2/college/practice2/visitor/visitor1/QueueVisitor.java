package practice2.college.practice2.visitor.visitor1;

public interface QueueVisitor {
    String visitCustomer(Customer customer);
    String visitOperator(Operator operator);
    String visitQueue(Queue queue);
}