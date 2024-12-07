package practice2.college.practice2.observer;

public class SysLogNotifier implements Observer{
    private String _journalName;

    public SysLogNotifier(String journalName) {
        this._journalName = journalName;
    }

    @Override
    public void notiify(SystemAlert systemAlert) {
        System.out.println("Journal with name: " + _journalName);

    }
}