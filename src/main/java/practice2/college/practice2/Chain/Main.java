package practice2.college.practice2.Chain;

public class Main {
    public static void main(String[] args) {
        WindowManager windowManager = new WindowManager("Main Window", 800, 600);

        VerticalLayout layout = new VerticalLayout("mainLayout", 800, 200);
        Button button1 = new Button("button1", "Click Me", "image1.png");
        Button button2 = new Button("button2", "Submit", "image2.png");

        layout.addComponent(button1);
        layout.addComponent(button2);
        windowManager.addComponentToWindow(layout);

        windowManager.draw();
    }
}
