package practice2.college.practice2.Chain;

import java.util.ArrayList;

public abstract class WindowComponent {
    protected String name;
    protected ArrayList<WindowComponent> nestedComponents = new ArrayList<>();

    public abstract void draw();

    public void addComponent(WindowComponent component) {
        nestedComponents.add(component);
    }

    public void removeComponent(String name) {
        for (int i = 0; i < nestedComponents.size(); i++) {
            if (nestedComponents.get(i).name.equals(name)) {
                nestedComponents.remove(i);
                break;
            }
        }
    }
}
