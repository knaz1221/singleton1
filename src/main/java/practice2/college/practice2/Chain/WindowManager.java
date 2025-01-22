package practice2.college.practice2.Chain;

public class WindowManager {
    private Window window;

    public WindowManager(String title, int width, int height) {
        this.window = new Window("mainWindow", title, width, height);
    }

    public void addComponentToWindow(WindowComponent component) {
        window.addComponent(component);
    }

    public void draw() {
        window.draw();
    }
}
