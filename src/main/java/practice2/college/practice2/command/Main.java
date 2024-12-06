package practice2.college.practice2.command;

public class Main {
    public static void main(String[] args){
        WindowController controller = new WindowController();
        AbstractCommand copyCom = new CopyCom();
        AbstractCommand cutCom = new CutCom();
        AbstractCommand insertCom = new InsertCom();
        controller.addCommand(copyCom);
        controller.removeCommand(cutCom);
        controller.undoCommand(insertCom);
        controller.undoChanges(2);
    }
}