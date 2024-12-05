package practice2.Practice2.singleton1.singleton2;

public class Client {
    private int _id;
    private String _name;
    private short _priority;

    public Client(int id, String name, short priority) {
        this._id = id;
        this._name = name;
        this._priority = priority;
    }

    public int getId() {
        return _id;
    }

    public String getName() {
        return _name;
    }

    public short getPriority() {
        return _priority;
    }

    @Override
    public String toString() {
        return "Client{id=" + _id + ", name='" + _name + "', priority=" + _priority + "}";
    }
}
