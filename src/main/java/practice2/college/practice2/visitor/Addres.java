package practice2.college.practice2.visitor;

public class Addres {
    private String country;
    private String region;
    private String city;
    private String street;
    private String district;
    private String houseNumber;
    private String additionalNotes;

    public Addres(String country, String region, String city, String street, String district, String houseNumber, String additionalNotes) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.district = district;
        this.houseNumber = houseNumber;
        this.additionalNotes = additionalNotes;
    }

    @Override
    public String toString() {
        return city + ", " + street;
    }
}
