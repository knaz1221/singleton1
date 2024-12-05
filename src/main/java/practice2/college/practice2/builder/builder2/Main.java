package practice2.college.practice2.builder.builder2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Person, QueueSystem> queue = new HashMap<>();
        QueueSystem queueSystem = new QueueSystem("Standart queue", "StandartSystem", 5);
        QueueSystem queueSystem1 = new QueueSystem("Standart", "Priority", 5);
        QueueManager queueManager = new QueueManager();
        queueManager.set_queueName("Standard Queue");
        queueManager.set_queueType("Standard");
        queueManager.set_maxCapacity(5);
        queueManager.build();
        queueManager.createQueue("Standard Queue", "Standard", 5);
        queueManager.createQueue("Priority Queue", "Priority", 3);
        Person person1 = new Person("John Doe", false, "10:00");
        Person person2 = new Person("Jane Smith", true, "10:05");
        Person person3 = new Person("Mike Johnson", false, "10:10");
        queueManager.assignPersonToQueue(person1, queue, queueSystem);
        queueManager.assignPersonToQueue(person2, queue, queueSystem1);
        queueManager.assignPersonToQueue(person3, queue, queueSystem);
        System.out.println(queueManager.getQueueInfo(queueSystem));
        System.out.println(queueManager.getQueueInfo(queueSystem1));
    }
}
