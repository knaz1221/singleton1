package practice2.college.practice2.Chain;

public class VerticalLayout extends WindowComponent {
    private int width;
    private int height;

    public VerticalLayout(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing vertical layout: " + name);
        System.out.println("Width: " + width + ", Height: " + height);
        for (WindowComponent component : nestedComponents) {
            component.draw();
        }
    }
}