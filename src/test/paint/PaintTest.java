package paint;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaintTest {

    private Paint p;
    @Before
    public void setUp(){
        p = new Paint("ChepoMax",19.99, 20, 10);

    }


    @Test
    public void getwaste() throws Exception {
        assertEquals(50.0, p.getwaste(5),1  );
    }

}