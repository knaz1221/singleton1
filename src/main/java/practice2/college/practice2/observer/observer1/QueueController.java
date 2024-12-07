package practice2.college.practice2.observer.observer1;

import java.util.ArrayList;

class QueueController extends Observable {
    private ArrayList<QueueItem> _queueList = new ArrayList<>();

    public void addToQueue(QueueItem item) {
        _queueList.add(item);
        notifyObservers("Added to queue: " + item.getDetails());
    }

    public void removeFromQueue(String itemId) {
        _queueList.removeIf(item -> item.getItemId().equals(itemId));
        notifyObservers("Removed from queue: " + itemId);
    }

    public String getQueueStatus() {
        ArrayList<String> q = new ArrayList<>();
        for (QueueItem item : _queueList) {
            q.add(item.getDetails());
        }
        return q.toString();
    }
}