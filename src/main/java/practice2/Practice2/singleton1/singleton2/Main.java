package practice2.Practice2.singleton1.singleton2;

public class Main {
    public static void main(String[] args) {
        ControlSystem system = ControlSystem.getInstance("MainSystem");
        ElectronicQueue queue1 = new ElectronicQueue("PriorityQueue");
        ElectronicQueue queue2 = new ElectronicQueue("GeneralQueue");

        system.addQueue(queue1);
        system.addQueue(queue2);

        Client client1 = new Client(1, "Alice", (short) 1);
        Client client2 = new Client(2, "Bob", (short) 2);
        Client client3 = new Client(3, "Charlie", (short) 1);

        queue1.addClient(client1);
        queue1.addClient(client2);

        queue2.addClient(client3);

        System.out.println("All queues in system:");
        System.out.println(system);

        System.out.println("\nNext client in PriorityQueue: " + queue1.getNextClient());
        System.out.println("Remaining clients in PriorityQueue: " + queue1.getAllClients());
    }
}
