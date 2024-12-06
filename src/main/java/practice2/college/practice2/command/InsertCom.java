package practice2.college.practice2.command;

public class InsertCom extends  AbstractCommand{
    private String _text;
    private WindowController _windowToInsert;

    @Override
    public void execute() {
        System.out.println("Insert executed");
    }

    @Override
    public void undo() {
        System.out.println("Insert undone");
    }
}