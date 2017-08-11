package librabry;

public class Address {

    private int houseNumber;
    private String street;
    private String town;
    private String countr;
    private String postCode;
    private String country;

    public Address(int houseNumber, String street, String town, String countr, String postCode, String country) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.town = town;
        this.countr = countr;
        this.postCode = postCode;
        this.country = country;
    }

    public Address(int houseNumber, String postCode) {
        this.houseNumber = houseNumber;
        this.postCode = postCode;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getPostCode() {
        return postCode;
    }
}
