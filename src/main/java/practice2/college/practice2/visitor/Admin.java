package practice2.college.practice2.visitor;

import java.time.LocalDateTime;

public class Admin extends Accountable {
    private String department;
    private LocalDateTime hireDate;

    public Admin(long id, String department, LocalDateTime hireDate) {
        super(id);
        this.department = department;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return department;
    }

    @Override
    public String accept(BankVisitor visitor) {
        return visitor.visitAdministrator(this);
    }
}

