package practice2.college.practice2.builder;

public class UaPictureBuild extends PictureBuilder{
    private Picture _picture;

    public UaPictureBuild(Picture picture) {
        this._picture = picture;
    }

    public void setBasicParams(String author, short year, String name) {
        _picture.set_author(author);
        _picture.set_year(year);
        _picture.set_name(name);
    }


    public void setSizeParams(Size size) {
        _picture.set_size(size);
    }

    public void setColorParams(String color, boolean isWithFrame, String canvas) {
        _picture.set_color(color);
        _picture.set_canvas(canvas);
    }


    public void setCategoryParams(String theme, String category) {
        _picture.set_theme(theme);
        _picture.set_category(category);
    }


    public Picture build() {
        System.out.println("You have a UA picture ");
        System.out.println(_picture.toString());
        return _picture;
    }

    @Override
    public String toString() {
        return "UaPictureBuilder " +
                "picture = " + _picture;
    }
}