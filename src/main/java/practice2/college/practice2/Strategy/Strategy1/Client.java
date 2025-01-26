package practice2.college.practice2.Strategy.Strategy1;

public class Client {
    private String firstName;
    private String lastName;
    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
