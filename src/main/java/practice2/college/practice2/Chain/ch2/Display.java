package practice2.college.practice2.Chain.ch2;

public class Display extends Queue {
    @Override
    public void handleRequest(Request request) {
        if ("updateDisplay".equals(request.action)) {
            System.out.println("Display: Calling client with ticket number " + request.ticketNumber);
        }
    }
}
