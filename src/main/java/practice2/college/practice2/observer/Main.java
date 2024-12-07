package practice2.college.practice2.observer;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        SystemAlert alert = new SystemAlert(AlertSeverity.WARNING, "CPU Overload", 1001, LocalDate.now(), "CPU");
        SystemController controller = new SystemController();

        EmailNotifier emailNotifier = new EmailNotifier("example@gmail.com");
        SysLogNotifier sysLogNotifier = new SysLogNotifier("warnings");
        PhoneNotifier phoneNotifier = new PhoneNotifier("+38055324123");
        TelegramNotifier telegramNotifier = new TelegramNotifier("1", true);

        controller.subscribe(emailNotifier);
        controller.subscribe(sysLogNotifier);
        controller.subscribe(phoneNotifier);
        controller.subscribe(telegramNotifier);

        controller.informAlert();
        controller.addAlert(alert);
        controller.informAlert();

    }
}