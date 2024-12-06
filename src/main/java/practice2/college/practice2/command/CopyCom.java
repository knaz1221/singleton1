package practice2.college.practice2.command;

public class CopyCom extends AbstractCommand{
    public void execute() {
        System.out.println("Copy executed");
    }
    public void undo() {
        System.out.println("Copy undone");
    }
}