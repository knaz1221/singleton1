package practice2.college.practice2.observer;

import java.util.ArrayList;

public abstract class Observable {
    private ArrayList<Observer> _observers = new ArrayList<>();
    public void subscribe(Observer observer){
        _observers.add(observer);
    }
    public  void unsubscribe(Observer observer){
        _observers.remove(observer);
    }
    public void notify_(SystemAlert alert){
        for (Observer not:
                _observers){
            not.notiify(alert);
        }
    }
}