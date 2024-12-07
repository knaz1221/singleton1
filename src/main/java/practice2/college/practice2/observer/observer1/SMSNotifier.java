package practice2.college.practice2.observer.observer1;

public class SMSNotifier implements Observer {
    private String _phoneNumber;

    public SMSNotifier(String phoneNumber) {
        this._phoneNumber = phoneNumber;
    }

    @Override
    public void info(String message) {
        System.out.println("SMS to " + _phoneNumber + ": " + message);
    }
}