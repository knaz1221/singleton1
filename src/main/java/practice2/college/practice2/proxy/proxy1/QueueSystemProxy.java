package practice2.college.practice2.proxy.proxy1;

public interface QueueSystemProxy {
    void addClient(String clientName);
    void removeClient(String clientName);
    void serveNextClient();
    int getQueueSize();
}