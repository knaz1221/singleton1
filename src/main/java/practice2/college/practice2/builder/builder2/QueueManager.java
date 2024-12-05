package practice2.college.practice2.builder.builder2;

import java.util.HashMap;


public class QueueManager extends QueueBuilder{
    private String _queueName;
    private String _queueType;
    private int _maxCapacity;
    private HashMap<String, QueueSystem> queueList;
    @Override
    public String get_queueName() {
        return _queueName;
    }

    @Override
    public String get_queueType() {
        return _queueType;
    }

    @Override
    public int get_maxCapacity() {
        return _maxCapacity;
    }

    public QueueManager() {
        this.queueList = new HashMap<>();
    }

    public void createQueue(String name, String type, int maxCapacity) {
        this._queueName = name;
        this._queueType = type;
        this._maxCapacity = maxCapacity;
    }

    public void assignPersonToQueue(Person person, HashMap<Person, QueueSystem> queueList, QueueSystem system) {
        queueList.put(person, system);
    }

    public String getQueueInfo(QueueSystem queueName) {
        return queueName.toString();
    }
    public void set_queueName(String _queueName) {
        this._queueName = _queueName;
    }

    public void set_queueType(String _queueType) {
        this._queueType = _queueType;

    }

    public void set_maxCapacity(int _maxCapacity) {
        this._maxCapacity = _maxCapacity;
    }

    public void build() {
        System.out.println("Queue created");
    }




}


