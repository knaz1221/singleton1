package practice2.college.practice2.Chain;

public class Window extends WindowComponent {
    private String title;
    private int width;
    private int height;

    public Window(String name, String title, int width, int height) {
        this.name = name;
        this.title = title;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        // Инициализация графики для окна
        System.out.println("Drawing window: " + title);
        System.out.println("Width: " + width + ", Height: " + height);
        for (WindowComponent component : nestedComponents) {
            component.draw();
        }
    }
}
