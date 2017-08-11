package librabry;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.lang.Integer.parseInt;

public class ItemList implements AddRemove {
    private List<Item> listofItems;
    private BufferedReader br;
    private BufferedWriter bw;

    public ItemList() {
        this.listofItems = new ArrayList<>();
    }



    @Override
    public void add(Object o) {
        listofItems.add((Item) o);
    }

    @Override
    public void remove(Object o) {
        listofItems.remove((Item) o);
    }

    @Override
    public void writeToFile() {
        try {
            bw = new BufferedWriter(new FileWriter("item.txt"));
            for (Item p: listofItems ) {
                String type="";
                if ( p instanceof Book){
                    type = "Book";
                } else if (p instanceof Magazine){
                    type = "Magazine";
                }else if (p instanceof Journal){
                    type = "Journal";
                }
                bw.write(type +", "+ p.getTitle()+", "+p.getPublication()+", "+p.getDate().getYear()+", "+p.getDate().getMonth()+", "+p.getDate().getDate()+", "+p.getNoOfPages()+", "+p.isAvailable() );
                bw.newLine();
            }
            bw.close();

        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void readFromFile() {

        try {
            br = new BufferedReader((new FileReader("item.txt")));
            String line = "";
            while ( (line = br.readLine()) != null){
                String[] sc = line.split(", ");
                if (sc[0].equals("Book")){
                    listofItems.add(new Book( sc[1],sc[2], new Date(parseInt(sc[3]),parseInt(sc[4]),parseInt(sc[5])), parseInt(sc[6]), sc[7].equals("true")));
                }else if ( sc[0].equals("Magazine")){
                    listofItems.add(new Magazine( sc[1],sc[2], new Date(parseInt(sc[3]),parseInt(sc[4]),parseInt(sc[5])), parseInt(sc[6]), sc[7].equals("true")));
                }else if( sc[0].equals("Journal")){
                    listofItems.add(new Journal( sc[1],sc[2], new Date(parseInt(sc[3]),parseInt(sc[4]),parseInt(sc[5])), parseInt(sc[6]), sc[7].equals("true")));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public int getNoOfItems() {
        return listofItems.size();
    }



    /**
     * To get the total number of books, magazines or journals in the library;
     * @param item The type of item to be looked up
     * @return the number the specific item in the library.
     */
    public int getNoOfSaidItem(String item) {
        int noOfitem = 0;
        for (Item i:listofItems ) {
            if (item.equals("book")&&i instanceof Book){
                noOfitem++;
            }else if (item.equals("magazine")&&i instanceof Magazine){
                noOfitem++;
            }else if (item.equals("journal")&&i instanceof Journal){
                noOfitem++;
            }
        }
        return noOfitem;
    }

    /**
     * To get the list of items that have been checked out by customeres and not on the shelf.
     * @return list of all books that have been checked out.
     */
    public ArrayList getBooksOnshelf() {
        ArrayList<Item> list = new ArrayList<>();
        int noOfitem =0;
        for (Item i:listofItems ) {
            if (i instanceof Book && i.isAvailable()) {
                list.add(i);
                noOfitem++;
            }
        }
        return list;
    }

    public ArrayList getCheckedOutBooks() {
        ArrayList<Item> list = new ArrayList<>();
        int noOfitem =0;
        for (Item i:listofItems ) {
            if (i instanceof Book && !i.isAvailable()) {
                list.add(i);
                noOfitem++;
            }
        }
        return list;
    }

}
