package practice2.college.practice2.Strategy;

public class User {
    private String firstName;
    private String lastName;
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
