package practice2.college.practice2.proxy.proxy1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSystem implements QueueSystemProxy {
    private Queue<String> queue = new LinkedList<>();

    @Override
    public void addClient(String clientName) {
        queue.offer(clientName);
        System.out.println("Client " + clientName + " added to the queue.");
    }

    @Override
    public void removeClient(String clientName) {
        if (queue.remove(clientName)) {
            System.out.println("Client " + clientName + " removed from the queue.");
        } else {
            System.out.println("Client " + clientName + " not found in the queue.");
        }
    }

    @Override
    public void serveNextClient() {
        String client = queue.poll();
        if (client != null) {
            System.out.println("Serving client: " + client);
        } else {
            System.out.println("The queue is empty.");
        }
    }

    @Override
    public int getQueueSize() {
        return queue.size();
    }
}
