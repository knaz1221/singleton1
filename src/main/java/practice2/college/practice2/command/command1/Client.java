package practice2.college.practice2.command.command1;

public class Client {
    private int _id;
    private String _name;
    private int _priority;

    public Client(int id, String name, int priority) {
        this._id = id;
        this._name = name;
        this._priority = priority;
    }

    public int get_id() {
        return _id;
    }

    public String get_name() {
        return _name;
    }

    public int get_priority() {
        return _priority;
    }

    public void set_priority(int _priority) {
        this._priority = _priority;
    }

    @Override
    public String toString() {
        return "Client: id = " + _id + ", name = '" + _name + "', priority = " + _priority;
    }
}
