package practice2.college.practice2.Strategy.Strategy1;

import java.time.LocalDateTime;


public class Ticket {
    private String ticketNumber;
    private LocalDateTime issueTime;
    private String serviceType;
    public Ticket(String ticketNumber, LocalDateTime issueTime, String serviceType) {
        this.ticketNumber = ticketNumber;
        this.issueTime = issueTime;
        this.serviceType = serviceType;
    }
    public String getTicketNumber() {
        return ticketNumber;
    }
    public LocalDateTime getIssueTime() {
        return issueTime;
    }
    public String getServiceType() {
        return serviceType;
    }
}
