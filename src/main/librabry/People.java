package librabry;

import java.util.ArrayList;

public abstract class People  {

    private String Name;
    private Address address;
    private int phoneNo;
    private  int membershipnumber = 0;
    private static int currMembershipnumber = 0;
    private ArrayList<Item> borrowedItems;

    public People(String name, Address address, int phoneNo) {
        Name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.membershipnumber = ++currMembershipnumber;
        borrowedItems= new ArrayList<>();
    }


    public String getName() {
        return Name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getMembershipnumber() {
        return membershipnumber;
    }

    public ArrayList<Item> getBorrowedItems() {
        return borrowedItems;
    }


    public int getNoOfBorrowedItems() {
        return borrowedItems.size();
    }

    public void borrowItem(Item item){
        borrowedItems.add(item);
    }
}
