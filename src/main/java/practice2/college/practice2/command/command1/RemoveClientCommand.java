package practice2.college.practice2.command.command1;

public class RemoveClientCommand extends QueueCommand {
    private QueueController _queueController;
    private int _clientId;
    private Client _removedClient;

    public RemoveClientCommand(QueueController queueController, int clientId) {
        this._queueController = queueController;
        this._clientId = clientId;
    }

    @Override
    public void execute() {
        _removedClient = _queueController.removeClient(_clientId);
    }

    @Override
    public void undo() {
        if (_removedClient != null) {
            _queueController.addClient(_removedClient);
        }
    }
}
