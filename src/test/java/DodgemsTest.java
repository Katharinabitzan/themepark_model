import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Best dodgems", 4);
    }

    @Test
    public void hasName(){
        assertEquals("Best dodgems", dodgems.getName());
    }

    @Test
    public void hasRating() { assertEquals(4, dodgems.getRating());}
}
