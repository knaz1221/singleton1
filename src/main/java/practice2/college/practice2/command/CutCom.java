package practice2.college.practice2.command;

public class CutCom extends AbstractCommand{
    private String _text;
    private String _startLine;

    public void execute() {
        System.out.println("Cut executed");
    }
    public void undo() {
        System.out.println("Cut undone");
    }
}