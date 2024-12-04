package org.Practice2.singleton1;

public class Main {
    public static void main(String[] args) {

        Galery galery = new Galery("Galaxy");

        Picture picture1 = new Picture("Star", 1999, "I don`t know author");
        Picture picture2 = new Picture("Sun" , 2014 , "Engineer");
        Picture picture3 = new Picture("Earth", 1895, "God");

        galery.addPicture(picture1);
        galery.addPicture(picture2);
        galery.addPicture(picture3);
        galery.removePicture(picture2);
        System.out.println(picture1);
        System.out.println("Pictures count: " + galery.getPictureCount());
        System.out.println("Gallery name: " + galery.getName());
        galery.setArticle("It is a gallery about galaxy, stars and planet");
        System.out.println("Article: " + galery.getArticle());
        System.out.println(galery);
    }
}
