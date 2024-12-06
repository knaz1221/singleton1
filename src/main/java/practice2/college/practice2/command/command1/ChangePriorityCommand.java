package practice2.college.practice2.command.command1;

public class ChangePriorityCommand extends QueueCommand {
    private QueueController _queueController;
    private int _clientId;
    private int _newPriority;
    private int _previousPriority;

    public ChangePriorityCommand(QueueController queueController, int clientId, int newPriority) {
        this._queueController = queueController;
        this._clientId = clientId;
        this._newPriority = newPriority;
    }

    @Override
    public void execute() {
        _previousPriority = _queueController.changePriority(_clientId, _newPriority);
    }

    @Override
    public void undo() {
        _queueController.changePriority(_clientId, _previousPriority);
    }
}
