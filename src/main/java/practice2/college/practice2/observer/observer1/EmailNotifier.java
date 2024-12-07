package practice2.college.practice2.observer.observer1;

public class EmailNotifier implements Observer {
    private String _email;

    public EmailNotifier(String email) {
        this._email = email;
    }

    @Override
    public void info(String message) {
        System.out.println("Email to " + _email + ": " + message);
    }
}
