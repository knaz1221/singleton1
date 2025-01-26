package practice2.college.practice2.Strategy;

public class WindowsOutputStrategy implements OutputStrategy {
    @Override
    public void printReport(Document document) {
        System.out.println("Printing report on Windows: " + document.getDocumentName());
    }
    @Override
    public void sendReportViaMail(Document document) {
        System.out.println("Sending report via mail on Windows: " + document.getDocumentName());
    }
    @Override
    public void sendReportViaTelegram(Document document) {
        System.out.println("Sending report via Telegram on Windows: " + document.getDocumentName());
    }
}
