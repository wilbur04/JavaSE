package librabry;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    private Library lib;

    @Before
    public void setUp(){
        lib = new Library("Citadel");
        lib.add(new  Member("lilly",new Address(23,"pe1 6ht"),928364547));
        lib.add(new Book("title", "publication", new Date(99,12,04), 400, true));

    }

    @Test
    public void testAdd(){
        assertEquals(1,lib.getListOfItemSize());
        assertEquals(1,lib.getListOfPeopleSize());
    }








    

}
