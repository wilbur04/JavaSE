package librabry;

import java.io.*;


public class Library {

    private String name;
    private PeopleList listOfPeople;
    private ItemList listofItems;
    BufferedReader br, br2;
    BufferedWriter bw ,bw2;

    public Library(String name){
        this.name=name;
        listOfPeople = new PeopleList();
        listofItems = new ItemList();

    }

    public int getListOfPeopleSize(){
        return listOfPeople.getNoOfPeople();
    }

    public int getListOfItemSize(){
        return listofItems.getNoOfItems();
    }


    public void add(Object o) {
        if (o instanceof People){
            listOfPeople.add(o);
        } else if (o instanceof Item){
            listofItems.add(o);
        }
    }

    public void write(){
        listOfPeople.writeToFile();
        listofItems.writeToFile();
    }

    public void read(){
        listofItems.readFromFile();
        listOfPeople.readFromFile();
    }




}
