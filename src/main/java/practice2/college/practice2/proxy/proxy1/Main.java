package practice2.college.practice2.proxy.proxy1;

public class Main {
    public static void main(String[] args) {
        QueueSystem realQueue = new QueueSystem();
        QueueSystemProxy proxy = new QueueSysProxy(realQueue);
        QueueController controller = new QueueController(proxy);

        controller.registerClient("Andrew");
        controller.registerClient("Maria");
        controller.registerClient("Ivan");

        System.out.println("Queue size: " + controller.getQueueSize());

        controller.processNextClient();
        controller.removeClient("Maria");

        System.out.println("Queue size: " + controller.getQueueSize());
    }
}