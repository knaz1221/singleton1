package org.Practice2.singleton1;

import java.util.HashMap;

class Galery {
    private HashMap<String, Integer> pictures;
    private String _name;
    private String _article;
    private static HashMap<String, Galery> _instances = new HashMap<>();

    public Galery(String name) {
        this._name = name;
        this.pictures = new HashMap<>();
        this._article = "";
        _instances.put(name, this);
    }

    public static Galery getInstance(String name) {
        return _instances.get(name);
    }

    public boolean addPicture(Picture picture) {
        if (!pictures.containsKey(picture.get_name())) {
            pictures.put(picture.get_name(), picture.get_year());
            return true;
        }
        return false;
    }

    public boolean removePicture(Picture picture) {
        if (pictures.containsKey(picture.get_name())) {
            pictures.remove(picture.get_name());
            return true;
        }
        return false;
    }

    public String describePicture(Picture picture) {
        if (pictures.containsKey(picture.get_name())) {
            return "Picture: " + picture.get_name() + ", year: " + pictures.get(picture.get_name());
        }
        return "Unknown picture";
    }


    public HashMap<String, Integer> getPictures() {
        return new HashMap<>(pictures);
    }

    public long getPictureCount() {
        return pictures.size();
    }

    public String getName() {
        return _name;
    }

    public void setArticle(String article) {
        this._article = article;
    }

    public String getArticle() {
        return _article;
    }

    @Override
    public String toString() {
        return "Gallery " +
                "pictures =" + pictures +
                ", name='" + _name + '\'' +
                ", article='" + _article ;
    }
}