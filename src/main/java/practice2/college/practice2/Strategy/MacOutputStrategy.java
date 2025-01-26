package practice2.college.practice2.Strategy;

public class MacOutputStrategy implements OutputStrategy {
    @Override
    public void printReport(Document document) {
        System.out.println("Printing report on Mac: " + document.getDocumentName());
    }
    @Override
    public void sendReportViaMail(Document document) {
        System.out.println("Sending report via mail on Mac: " + document.getDocumentName());
    }
    @Override
    public void sendReportViaTelegram(Document document) {
        System.out.println("Sending report via Telegram on Mac: " + document.getDocumentName());
    }
}
