package librabry;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Library {

    private String name;
    private PeopleList listOfPeople;
    private ItemList listofItems;
    BufferedReader br, br2;

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


    public  void ReadFromFile(){
        try {
            br = new BufferedReader((new FileReader("people.txt")));
            br2 = new BufferedReader((new FileReader("items.txt")));
            String line = "";
            while ( (line = br.readLine()) != null){
                String[] sc = line.split(", ");
                listOfPeople.add(new Member(sc[0],new Address(parseInt(sc[1]), sc[2]),parseInt(sc[3])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
