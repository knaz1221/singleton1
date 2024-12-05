package practice2.college.practice2.builder;

public class UsaPictureBuild extends PictureBuilder {
    private Picture _picture;

    public UsaPictureBuild(Picture usaPicture) {
        this._picture = usaPicture;
    }

    public void setBasicParams(String name, short year, String author) {
        _picture.set_name(name);
        _picture.set_year(year);
        _picture.set_author(author);
    }


    public void setSizeParams(Size size) {
        _picture.set_size(size);
    }

    @Override
    public void setColorParams(String color, boolean isWithFrame, String canvas) {
        if (isWithFrame) {
            _picture.set_color(color);
            _picture.set_canvas(canvas);
        }
    }


    public void setColorParams(String color, String canvas) {
        _picture.set_color(color);
        _picture.set_canvas(canvas);
    }


    public void setCategoryParams(String theme, String category) {
        _picture.set_theme(theme);
        _picture.set_category(category);
    }




    public Picture build() {
        System.out.println("You have a USA picture");
        System.out.println(_picture.toString());
        return _picture;
    }


    @Override
    public String toString() {
        return "UsaPiictureBuilder " +
                "picture = " + _picture ;
    }
}