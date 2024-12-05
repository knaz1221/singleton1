package practice2.Practice2.singleton1;

class Picture {
    private String _name;
    private int _year;
    private String _author;

    public Picture(String _name, int _year, String _author) {
        this._name = _name;
        this._year = _year;
        this._author = _author;
    }

    public String get_name() {
        return _name;
    }

    public int get_year() {
        return _year;
    }

    public String get_author() {
        return _author;
    }

    public String toString() {
        return "Picture " +
                "name='" + get_name() + '\'' +
                ", year=" + get_year() +
                ", author='" + get_author();
    }
}