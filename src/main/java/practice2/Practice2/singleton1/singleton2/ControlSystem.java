package practice2.Practice2.singleton1.singleton2;

import java.util.HashMap;
import java.util.Map;


public class ControlSystem {
    private static Map<String, ControlSystem> _instances = new HashMap<>();
    private Map<String, ElectronicQueue> _queues;

    // Приватный конструктор
    private ControlSystem() {
        this._queues = new HashMap<>();
    }

    public static ControlSystem getInstance(String name) {
        if (!_instances.containsKey(name)) {
            _instances.put(name, new ControlSystem());
        }
        return _instances.get(name);
    }

    public boolean addQueue(ElectronicQueue queue) {
        if (_queues.containsKey(queue.getQueueName())) {
            return false; // Очередь с таким именем уже существует
        }
        _queues.put(queue.getQueueName(), queue);
        return true;
    }

    public boolean removeQueue(ElectronicQueue queue) {
        return _queues.remove(queue.getQueueName(), queue);
    }

    public ElectronicQueue getQueue(String name) {
        return _queues.get(name);
    }

    public Map<String, ElectronicQueue> getAllQueues() {
        return new HashMap<>(_queues);
    }

    @Override
    public String toString() {
        return "ControlSystem{queues=" + _queues + "}";
    }
}

