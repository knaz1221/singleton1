package practice2.college.practice2.Chain.ch2;

public class Main {
    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        Server server = new Server();
        Display display = new Display();

        terminal.setNextHandler(server);
        server.setNextHandler(display);

        Request ticketRequest = new Request("generateTicket", 0);
        terminal.handleRequest(ticketRequest);

        Request serveNextRequest = new Request("serveNext", 0);
        server.handleRequest(serveNextRequest);
    }
}
