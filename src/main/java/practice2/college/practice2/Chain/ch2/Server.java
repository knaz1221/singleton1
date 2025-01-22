package practice2.college.practice2.Chain.ch2;

public class Server extends Queue {
    private int currentServing = 0;
    @Override
    public void handleRequest(Request request) {
        if ("serveNext".equals(request.action)) {
            currentServing++;
            System.out.println("Server: Serving next client with number " + currentServing);
            if (nextHandler != null) {
                nextHandler.handleRequest(new Request("updateDisplay", currentServing));
            }
        } else if ("generateTicket".equals(request.action)) {
            System.out.println("Server: Registered client with ticket number " + request.ticketNumber);
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        }
    }
}
