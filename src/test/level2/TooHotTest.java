package level2;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TooHotTest {
    private TooHot th ;
    @Before
    public void setUp() throws Exception {
        th =new TooHot();
    }

    @Test
    public void tooHot() throws Exception {
        assertEquals("testing too hot",true, th.tooHot(92,false));

    }

}