package level2;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueSumTest {

    private UniqueSum us;
    @Before
    public void setUp(){
        us = new UniqueSum();
    }

    @Test
    public void findUniqueSum() throws Exception {
        assertEquals("finding unique sum", 2, us.findUniqueSum(1,1,2));
    }

}