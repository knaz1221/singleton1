package practice2.college.practice2.builder.builder2;

import java.util.LinkedList;

public class QueueSystem {
    private String _queueName;
    private String _queueType;
    private int _maxCapacity;
    private LinkedList<Person> queue;

    public QueueSystem(String queueName, String queueType, int maxCapacity) {
        this._queueName = queueName;
        this._queueType = queueType;
        this._maxCapacity = maxCapacity;
        this.queue = new LinkedList<>();
    }

    public boolean addPerson(Person person) {
        if (queue.size() < _maxCapacity) {
            queue.add(person);
            return true;
        } else {
            System.out.println("Queue is full!");
            return false;
        }
    }

    public Person removePerson() {
        return queue.poll();
    }

    public int getQueueSize() {
        return queue.size();
    }

    public String get_queueName() {
        return _queueName;
    }

    @Override
    public String toString() {
        return "Queue{name='" + _queueName + "', type='" + _queueType + "', size=" + queue.size() + ", people=" + queue + "}";
    }
}
