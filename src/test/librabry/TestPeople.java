package librabry;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class TestPeople {

    private People person;

    @Before
    public void setUp(){
        person = new Member("bob", new Address(23,"pe1 6ht"),123456789);
    }

    @Test
    public void testIdSystem(){
        People p = new Member("illy",new Address(23,"pe1 6ht"),928364547);
        assertEquals("testing ID sysytem",3, p.getMembershipnumber());
    }

    @Test
    public void testNoOfBorrowedItems(){
        assertEquals("testing what you borrowed",0,person.getNoOfBorrowedItems());
    }

    @Test
    public void testborrowingItems(){
        person.borrowItem(new Book("title", "publication", new Date(99,12,04), 400, true));
        assertEquals("testing what you borrowed",1,person.getNoOfBorrowedItems());
    }





}
