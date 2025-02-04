package practice2.college.practice2.proxy.proxy1;

public class QueueSysProxy implements QueueSystemProxy {
    private QueueSystem realQueueSystem;

    public QueueSysProxy(QueueSystem realQueueSystem) {
        this.realQueueSystem = realQueueSystem;
    }

    @Override
    public void addClient(String clientName) {
        System.out.println("Access check before adding client...");
        realQueueSystem.addClient(clientName);
    }

    @Override
    public void removeClient(String clientName) {
        System.out.println("Access check before removing client...");
        realQueueSystem.removeClient(clientName);
    }

    @Override
    public void serveNextClient() {
        System.out.println("Access check before serving client...");
        realQueueSystem.serveNextClient();
    }

    @Override
    public int getQueueSize() {
        return realQueueSystem.getQueueSize();
    }
}
