package practice2.college.practice2.proxy.proxy1;

public class QueueController {
    private QueueSystemProxy queueHandler;

    public QueueController(QueueSystemProxy queueHandler) {
        this.queueHandler = queueHandler;
    }

    public void registerClient(String clientName) {
        queueHandler.addClient(clientName);
    }

    public void processNextClient() {
        queueHandler.serveNextClient();
    }

    public void removeClient(String clientName) {
        queueHandler.removeClient(clientName);
    }

    public int getQueueSize() {
        return queueHandler.getQueueSize();
    }
}
