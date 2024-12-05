package practice2.college.practice2.builder;

public abstract class PictureBuilder {
    private Picture picture;
    public abstract void setBasicParams(String name, short year, String author);
    public abstract void setSizeParams(Size size);
    public abstract void setColorParams(String color, boolean isWithFrame, String canvas);
    public abstract void setCategoryParams(String theme, String category);
    public abstract Picture build();
}