package level2;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BlackjackTest {
    private Blackjack blackJack;

    @Before
    public void setUp() throws Exception {
        blackJack = new Blackjack();

    }

    @Test
    public void playBlackJack() throws Exception {
        assertEquals("testing blackjack", 20, blackJack.playBlackJack(17, 20));
    }

}