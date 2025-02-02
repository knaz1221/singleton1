package practice2.college.practice2.visitor.visitor1;

import java.util.ArrayList;

public class QueueStorage {
    private ArrayList<QueueEntity> entities = new ArrayList<>();
    private QueueVisitor serializer;

    public void save() {
        for (var entity : entities) {
            String out = entity.accept(serializer);
            System.out.println(out);
        }
    }

    public void changeFormat(String format) {
        if (format.equals("DB")) {
            serializer = new QueueDatabaseVisitor();
        } else {
            serializer = new QueueJsonVisitor();
        }
    }

    public void addEntity(QueueEntity entity) {
        entities.add(entity);
    }
}
