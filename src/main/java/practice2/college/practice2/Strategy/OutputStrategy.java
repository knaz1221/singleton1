package practice2.college.practice2.Strategy;

public interface OutputStrategy {
    void printReport(Document document);
    void sendReportViaMail(Document document);
    void sendReportViaTelegram(Document document);
}