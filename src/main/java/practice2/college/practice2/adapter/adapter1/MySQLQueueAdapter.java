package practice2.college.practice2.adapter.adapter1;

public class MySQLQueueAdapter implements QueueDatabaseAdapter {
    @Override
    public String[] getNextInQueue() {
        System.out.println("Getting next in queue from MySQL");
        return new String[]{"Person1", "Person2"};
    }

    @Override
    public void addPersonToQueue(String person) {
        System.out.println("Adding person to MySQL queue: " + person);
    }

    @Override
    public boolean checkQueueStatus() {
        System.out.println("Checking MySQL queue status");
        return true;
    }

    @Override
    public void commit() {
        System.out.println("Committing MySQL transaction");
    }

    @Override
    public void rollback() {
        System.out.println("Rolling back MySQL transaction");
    }
}
