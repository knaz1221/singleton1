package practice2.college.practice2.observer;

public class PhoneNotifier implements Observer{
    private String _phoneNumber;

    public PhoneNotifier(String phoneNumber) {
        this._phoneNumber = phoneNumber;
    }

    @Override
    public void notiify(SystemAlert systemAlert) {
        System.out.println(_phoneNumber + " call to you");

    }
}