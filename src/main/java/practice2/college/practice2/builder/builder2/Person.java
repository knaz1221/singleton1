package practice2.college.practice2.builder.builder2;

public class Person {
    private String _name;
    private boolean _priority;
    private String _arrivalTime;

    public Person(String name, boolean priority, String arrivalTime) {
        this._name = name;
        this._priority = priority;
        this._arrivalTime = arrivalTime;
    }

    public String get_name() {
        return _name;
    }

    public boolean is_priority() {
        return _priority;
    }

    public String get_arrivalTime() {
        return _arrivalTime;
    }

    @Override
    public String toString() {
        return "Person{name='" + _name + "', priority=" + _priority + ", arrivalTime='" + _arrivalTime + "'}";
    }
}
