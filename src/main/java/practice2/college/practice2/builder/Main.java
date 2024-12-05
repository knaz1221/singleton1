package practice2.college.practice2.builder;

public class Main {
    public static void main(String[] args){
        Picture usaPicture = new Picture("Zelenski", (short) 2017, "Ukraine", "humanity", "prezident","red, dark, white, yellow", new Size(1600,900),"vertical", "2");
        Picture uaPicture = new Picture("Kozak", (short) 1921, "USA", "humanity", "village","red, dark, blue, yellow", new Size(1600,900),"gorizontal", "1");
        UsaPictureBuild usaPictureBuild = new UsaPictureBuild(usaPicture);
        UaPictureBuild uaPictureBuild = new UaPictureBuild(uaPicture);
        uaPictureBuild.build();
        usaPictureBuild.build();
    }
}
