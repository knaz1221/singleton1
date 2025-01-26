package practice2.college.practice2.Strategy;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Report1", LocalDateTime.now(), "This is a sample report.", "John Doe");
        OutputController ocController = new OutputController(document);

        String systemPlatform = System.getProperty("os.name").toLowerCase();

        if (systemPlatform.contains("win")) {
            ocController.setOutputStrategy(new WindowsOutputStrategy());
        } else if (systemPlatform.contains("linux")) {
            ocController.setOutputStrategy(new LinuxOutputStrategy());
        } else if (systemPlatform.contains("mac")) {
            ocController.setOutputStrategy(new MacOutputStrategy());
        } else {
            ocController.setOutputStrategy(new AndroidOutputStrategy());
        }

        ocController.printReport();
        ocController.sendReportViaMail();
    }
}
