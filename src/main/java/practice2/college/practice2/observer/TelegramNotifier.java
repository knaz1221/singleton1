package practice2.college.practice2.observer;

public class TelegramNotifier implements Observer{
    private String _userId;
    private boolean _isInstant;

    public TelegramNotifier(String _userId, boolean _isInstant) {
        this._userId = _userId;
        this._isInstant = _isInstant;
    }

    @Override
    public void notiify(SystemAlert systemAlert) {
        System.out.println(_userId + " just written a message to you");
    }
}