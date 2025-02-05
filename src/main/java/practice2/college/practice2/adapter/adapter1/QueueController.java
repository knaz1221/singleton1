package practice2.college.practice2.adapter.adapter1;

public class QueueController {
    private final QueueAccessProxy queueAccessProxy;

    public QueueController(QueueAccessProxy queueAccessProxy) {
        this.queueAccessProxy = queueAccessProxy;
    }

    public void addPerson(String person) {
        queueAccessProxy.addPersonToQueue(person);
    }

    public void processNext() {
        String[] nextPersons = queueAccessProxy.getNextInQueue();
        for (String person : nextPersons) {
            System.out.println("Processing person: " + person);
        }
    }
}
