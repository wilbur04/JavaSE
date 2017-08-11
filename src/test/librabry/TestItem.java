package librabry;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestItem {
    private Item item;

    @Before
    public void setUp(){
        item = new Book("title", "publication", new Date(99,12,04), 400, true);
    }

    @Test
    public void testGetName(){
        assertEquals("title", item.getTitle());
    }


    @Test
    public void testGetPublication(){
        assertEquals("publication", item.getPublication());
    }

    @Test
    public void testGetDate(){
        assertEquals(new Date(99,12,04), item.getDate());
    }

    @Test
    public void testGetNoPages(){
        assertEquals(400, item.getNoOfPages());
    }

    @Test
    public void testisAvailable(){
        assertTrue(item.isAvailable());
    }

    @Test
    public void testsetAvailable(){
        item.setAvailable(false);
        assertFalse(item.isAvailable());
    }

    @Test
    public void testCheckout() {
        item.checkout();
    }

    @Test
    public void testCheckin() {
        item.checkin();
    }


}
