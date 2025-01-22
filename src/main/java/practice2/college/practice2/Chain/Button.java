package practice2.college.practice2.Chain;

public class Button extends WindowComponent {
    private String text;
    private String imagePath;

    public Button(String name, String text, String imagePath) {
        this.name = name;
        this.text = text;
        this.imagePath = imagePath;
    }

    @Override
    public void draw() {
        System.out.println("Drawing button: " + text);
        System.out.println("Image path: " + imagePath);
    }
}