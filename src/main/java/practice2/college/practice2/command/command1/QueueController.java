package practice2.college.practice2.command.command1;

import java.util.*;

public class QueueController {
    private List<Client> _queue = new ArrayList<>();
    private List<QueueCommand> _commandHistory = new ArrayList<>();
    private Stack<QueueCommand> _undoStack = new Stack<>();

    public void addClient(Client client) {
        _queue.add(client);
        System.out.println("Client added: " + client);
    }

    public Client removeClient(int clientId) {
        for (Client client : _queue) {
            if (client.get_id() == clientId) {
                _queue.remove(client);
                System.out.println("Client removed: " + client);
                return client;
            }
        }
        return null;
    }

    public int changePriority(int clientId, int newPriority) {
        for (Client client : _queue) {
            if (client.get_id() == clientId) {
                int oldPriority = client.get_priority();
                client.set_priority(newPriority);
                System.out.println("Client priority changed: " + client);
                return oldPriority;
            }
        }
        return -1;
    }

    public void executeCommand(QueueCommand command) {
        command.execute();
        _commandHistory.add(command);
        _undoStack.push(command);
    }

    public void undoLastCommand() {
        if (!_undoStack.isEmpty()) {
            QueueCommand command = _undoStack.pop();
            command.undo();
        } else {
            System.out.println("No commands to undo.");
        }
    }

    public void printQueue() {
        System.out.println("Queue: " + _queue);
    }
}
