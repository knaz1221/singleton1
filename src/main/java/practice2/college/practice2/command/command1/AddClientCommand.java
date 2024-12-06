package practice2.college.practice2.command.command1;

public class AddClientCommand extends QueueCommand {
    private QueueController _queueController;
    private Client _client;

    public AddClientCommand(QueueController queueController, Client client) {
        this._queueController = queueController;
        this._client = client;
    }

    @Override
    public void execute() {
        _queueController.addClient(_client);
        System.out.println("Client executed");
    }

    @Override
    public void undo() {
        _queueController.removeClient(_client.get_id());
        System.out.println("Undo client");
    }
}

