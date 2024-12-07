package practice2.college.practice2.observer.observer1;

import java.time.LocalDateTime;

public class QueueItem {
    private String _itemId;
    private User _userDetails;
    private LocalDateTime _timestamp;

    public QueueItem(String itemId, User userDetails) {
        this._itemId = itemId;
        this._userDetails = userDetails;
        this._timestamp = LocalDateTime.now();
    }

    public String getItemId() {
        return _itemId;
    }

    public User getUserDetails() {
        return _userDetails;
    }

    public LocalDateTime getTimestamp() {
        return _timestamp;
    }

    public String getDetails() {
        return "ID: " + _itemId + ", User: " + _userDetails.getName() + ", Time: " + _timestamp.toString();
    }
}