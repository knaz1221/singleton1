package practice2.college.practice2.observer;

public class EmailNotifier implements Observer{
    private String _uniqueName;

    public EmailNotifier(String uniqueName) {
        this._uniqueName = uniqueName;
    }

    @Override
    public void notiify(SystemAlert systemAlert) {
        System.out.println(_uniqueName);

    }
}