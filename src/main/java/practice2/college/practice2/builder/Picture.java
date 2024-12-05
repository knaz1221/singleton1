package practice2.college.practice2.builder;

public class Picture {
    private String _name;
    private short _year;
    private String _author;
    private String _theme;
    private String _category;
    private String _color;
    private Size _size;
    private String _format;
    private String _canvas;

    public Picture(String name, short year, String author, String category, String theme, String color, Size size, String format, String canvas) {
        this._name = name;
        this._year = year;
        this._author = author;
        this._category = category;
        this._theme = theme;
        this._color = color;
        this._size = size;
        this._format = format;
        this._canvas = canvas;
    }


    @Override
    public String toString() {
        return "name = '" + _name + '\'' +
                ", year = " + _year +
                ", author = '" + _author + '\'' +
                ", theme = '" + _theme + '\'' +
                ", category = '" + _category + '\'' +
                ", color = '" + _color + '\'' +
                ", size = '" + _size + '\'' +
                ", format = '" + _format + '\'' +
                ", canvas = '" + _canvas + '\'';
    }

    public String get_name() {
        return _name;
    }

    public short get_year() {
        return _year;
    }

    public void set_author(String _author) {
        this._author = _author;
    }

    public void set_theme(String _theme) {
        this._theme = _theme;
    }

    public void set_category(String _category) {
        this._category = _category;
    }

    public void set_color(String _color) {
        this._color = _color;
    }

    public void set_size(Size _size) {
        this._size = _size;
    }

    public void set_format(String _format) {
        this._format = _format;
    }

    public void set_canvas(String _canvas) {
        this._canvas = _canvas;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_year(short _year) {
        this._year = _year;
    }
}