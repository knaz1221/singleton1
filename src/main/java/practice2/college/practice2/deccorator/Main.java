package practice2.college.practice2.deccorator;

public class Main {
    public static void main(String[] args) {
        NotificationWrapper wrapper = new EmailWrapper(null, "user@gmail.com");

        if (System.getProperty("os.name").toLowerCase().contains("linux")) {
            wrapper = new SystemLogWrapper(wrapper, "LinuxJournal1");
        }

        boolean hasTelegram = true;
        if (hasTelegram) {
            wrapper = new TelegramWrapper(wrapper, "Admin", true);
        }

        String phoneNumber = "+380996541321";
        if (phoneNumber != null) {
            wrapper = new PhoneWrapper(wrapper, phoneNumber);
        }
        SystemController sysController = new SystemController(wrapper);
        sysController.addAlert(new SystemAlert("System1", "Warning1"));
        sysController.addAlert(new SystemAlert("System2", "Warning2"));
    }
}