package practice2.college.practice2.observer;

import java.util.ArrayList;

public class SystemController extends Observable {
    private ArrayList<SystemAlert> _alertHistory = new ArrayList<>();

    public SystemController() {
    }
    public void informAlert(){
        if (!_alertHistory.isEmpty()) {
            for (SystemAlert q :
                    _alertHistory) {
                notify_(q);
            }
            _alertHistory.clear();
        }else {
            System.out.println("History is empty");
        }
    }
    public void addAlert(SystemAlert alert){
        _alertHistory.add(alert);
    }
}