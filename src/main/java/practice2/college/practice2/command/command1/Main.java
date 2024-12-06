package practice2.college.practice2.command.command1;

public class Main {
    public static void main(String[] args) {
        QueueController queueController = new QueueController();
        Client client1 = new Client(1, "Alice", 3);
        Client client2 = new Client(2, "Bob", 1);
        AddClientCommand addClient1 = new AddClientCommand(queueController, client1);
        AddClientCommand addClient2 = new AddClientCommand(queueController, client2);
        ChangePriorityCommand changePriority = new ChangePriorityCommand(queueController, 1, 5);
        RemoveClientCommand removeClient = new RemoveClientCommand(queueController, 1);
        queueController.executeCommand(addClient1);
        queueController.executeCommand(addClient2);
        queueController.executeCommand(changePriority);
        queueController.executeCommand(removeClient);
        queueController.printQueue();
        queueController.undoLastCommand();
        queueController.printQueue();
    }
}
