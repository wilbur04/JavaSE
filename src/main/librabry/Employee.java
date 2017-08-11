package librabry;

public class Employee extends People {

    private String niNumber;
    public Employee(String name, Address address, int phoneNo) {
        super(name, address, phoneNo);
    }

    public String getNiNumber() {
        return niNumber;
    }

    public void setNiNumber(String niNumber) {
        this.niNumber = niNumber;
    }


}
