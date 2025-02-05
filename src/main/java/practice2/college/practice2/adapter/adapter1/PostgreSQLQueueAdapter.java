package practice2.college.practice2.adapter.adapter1;

public class PostgreSQLQueueAdapter implements QueueDatabaseAdapter {
    @Override
    public String[] getNextInQueue() {
        System.out.println("Getting next in queue from PostgreSQL");
        return new String[]{"PG_Person1", "PG_Person2"};
    }

    @Override
    public void addPersonToQueue(String person) {
        System.out.println("Adding person to PostgreSQL queue: " + person);
    }

    @Override
    public boolean checkQueueStatus() {
        System.out.println("Checking PostgreSQL queue status");
        return true;
    }

    @Override
    public void commit() {
        System.out.println("Committing PostgreSQL transaction");
    }

    @Override
    public void rollback() {
        System.out.println("Rolling back PostgreSQL transaction");
    }
}
