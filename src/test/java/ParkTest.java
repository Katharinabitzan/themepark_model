import attractions.Park;
import interfaces.IReviewed;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    IReviewed park;

    @Before
    public void before(){
        park = new Park("Best park", 4);
    }

    @Test
    public void hasName(){
        assertEquals("Best park", park.getName());
    }

    @Test
    public void hasRating() { assertEquals(4, park.getRating());}
}
