package practice2.college.practice2.adapter.adapter1;

public class MongoDBQueueAdapter implements QueueDatabaseAdapter {
    @Override
    public String[] getNextInQueue() {
        System.out.println("Getting next in queue from MongoDB");
        return new String[]{"Mongo_Person1", "Mongo_Person2"};
    }

    @Override
    public void addPersonToQueue(String person) {
        System.out.println("Adding person to MongoDB queue: " + person);
    }

    @Override
    public boolean checkQueueStatus() {
        System.out.println("Checking MongoDB queue status");
        return true;
    }

    @Override
    public void commit() {
        System.out.println("Committing MongoDB transaction");
    }

    @Override
    public void rollback() {
        System.out.println("Rolling back MongoDB transaction");
    }
}
