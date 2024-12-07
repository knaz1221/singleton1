package practice2.college.practice2.observer.observer1;

public class User {
    private String _userId;
    private String _name;
    private String _phoneNumber;

    public User(String userId, String name, String phoneNumber) {
        this._userId = userId;
        this._name = name;
        this._phoneNumber = phoneNumber;
    }

    public String getUserId() {
        return _userId;
    }

    public String getName() {
        return _name;
    }

    public String getPhoneNumber() {
        return _phoneNumber;
    }
}
