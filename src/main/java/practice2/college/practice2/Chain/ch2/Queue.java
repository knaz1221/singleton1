package practice2.college.practice2.Chain.ch2;

public abstract class Queue {
    protected Queue nextHandler;

    public void setNextHandler(Queue nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(Request request);
}