package librabry;

import org.junit.Before;
import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.assertEquals;

public class TestPeopleList {

    private PeopleList list;
    @Before
    public void setUp(){
        list= new PeopleList();
        list.add(new  Member("lilly",new Address(23,"pe1 6ht"),928364547));

    }


    @Test
    public void testListOfPeople(){
        assertEquals(1,list.getNoOfPeople());
        list.add(new  Member("illy",new Address(23,"pe1 6ht"),928364547));
        assertEquals(2,list.getNoOfPeople());
    }



    @Test
    public void getLisOfEmployees(){
        list.add(new Employee("illy",new Address(23,"pe1 6ht"),928364547));
        list.add(new Employee("Tilly",new Address(23,"pe1 6ht"),928364547));

    }

    @Test
    public void testReadAndWrite(){
        list.writeToFile();
        list.readFromFile();
        assertEquals(1,list.getNoOfPeople());
    }
}
