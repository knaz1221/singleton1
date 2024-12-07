package practice2.college.practice2.observer.observer1;

import java.util.ArrayList;

public abstract class Observable {
    private ArrayList<Observer> _observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        _observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        _observers.remove(observer);
    }

    protected void notifyObservers(String message) {
        for (Observer observer : _observers) {
            observer.info(message);
        }
    }
}
