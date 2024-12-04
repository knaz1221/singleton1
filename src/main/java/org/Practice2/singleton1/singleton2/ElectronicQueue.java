package org.Practice2.singleton1.singleton2;

import java.util.ArrayDeque;
import java.util.Queue;

public class ElectronicQueue {
    private Queue<Client> _clients;
    private String _name;

    public ElectronicQueue(String name) {
        this._name = name;
        this._clients = new ArrayDeque<>();
    }

    public boolean addClient(Client client) {
        return _clients.add(client);
    }

    public boolean removeClient(Client client) {
        return _clients.remove(client);
    }

    public Client getNextClient() {
        if (_clients.isEmpty()){
            return null;
        }else {
            return _clients.peek();
        }
    }

    public Queue<Client> getAllClients() {
        return new ArrayDeque<>(_clients);
    }

    public String getQueueName() {
        return _name;
    }

    public long getClientCount() {
        return _clients.size();
    }

    @Override
    public String toString() {
        return "Queue{name='" + _name + "', clients=" + _clients + "}";
    }
}

