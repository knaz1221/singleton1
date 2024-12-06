package practice2.college.practice2.command;

import java.util.ArrayList;

public class WindowController {
    private ArrayList<AbstractCommand> _commandsToexecute = new ArrayList<>();
    private ArrayList<AbstractCommand> _commandsHistory = new ArrayList<>();
    public void addCommand (AbstractCommand command){
        _commandsToexecute.add(command);
    }
    public void  removeCommand(AbstractCommand command){
        for (var com :
                _commandsToexecute){
            if (com == command){
                _commandsToexecute.remove(command);
            }
        }
    }
    public void undoCommand(AbstractCommand command) {
        for (var com :
                _commandsHistory){
            if (com == command){
                _commandsHistory.remove(command);
            }
        }
    }
    public void executeAllPendingCommands(){
        for (var com:
                _commandsToexecute){
            _commandsHistory.add(com);
            _commandsToexecute.remove(com);
        }
    }
    public void undoChanges(int changesToUndo) {
        for (int i = 0; i < changesToUndo && !_commandsHistory.isEmpty(); i++) {
            AbstractCommand command = _commandsHistory.remove(_commandsHistory.size() - 1);
            command.undo();
        }
    }
}