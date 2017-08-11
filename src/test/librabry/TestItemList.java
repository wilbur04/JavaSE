package librabry;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class TestItemList {

    private ItemList list;

    @Before
    public void setUp(){
        list = new ItemList();
        list.add(new Book("title", "publication", new Date(99,12,04), 400, true));

    }

    @Test
    public void testListOfItems(){
        assertEquals(1,list.getNoOfItems());
    }


    @Test
    public void testNumberofSaidItem(){
        assertEquals(1,list.getNoOfSaidItem("book"));
        assertEquals(0,list.getNoOfSaidItem("journal"));
        list.add(new Magazine("title", "publication", new Date(99,12,04), 400, true));
        assertEquals(1,list.getNoOfSaidItem("magazine"));
        list.add(new Journal("title", "publication", new Date(99,12,04), 400, true));
        assertEquals(1,list.getNoOfSaidItem("journal"));
        assertEquals(1,list.getNoOfSaidItem("book"));
    }

    @Test
    public void testGetBooksOnShelf(){
        list.add(new Book("title2", "publication", new Date(99,12,04), 400, false));
        assertEquals(1,list.getBooksOnshelf().size());
    }

    @Test
    public void testCheckCheckedOutBooks(){
        list.add(new Book("title2", "publication", new Date(99,12,04), 400, false));
        list.add(new Book("title3", "publication", new Date(99,12,04), 400, false));
        assertEquals(2,list.getCheckedOutBooks().size());
    }

    @Test
    public void testReadAndWrite(){
        list.writeToFile();
        list.readFromFile();
        assertEquals(2,list.getNoOfItems());
    }


}
