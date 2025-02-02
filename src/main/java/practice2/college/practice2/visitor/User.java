package practice2.college.practice2.visitor;

import java.time.LocalDateTime;

public class User extends Accountable {
    private String firstName;
    private String lastName;
    private LocalDateTime birthDate;
    private Addres address;

    public User(long id, String firstName, String lastName, LocalDateTime birthDate, Addres address) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public String accept(BankVisitor visitor) {
        return visitor.visitUser(this);
    }
}
