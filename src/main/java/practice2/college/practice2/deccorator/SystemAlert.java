package practice2.college.practice2.deccorator;

import java.time.LocalDateTime;

public class SystemAlert {
    private String message;
    private String processName;
    private LocalDateTime timestamp;

    public SystemAlert(String message, String processName) {
        this.message = message;
        this.processName = processName;
        this.timestamp = LocalDateTime.now();
    }
    public String getMessage() {
        return message;
    }
    public String getProcessName() {
        return processName;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}