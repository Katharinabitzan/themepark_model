import stalls.CandyStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyStallTest {

    CandyStall candyStall;

    @Before
    public void before(){
        candyStall = new CandyStall("Yay Candy", "Fred", 1, 5);
    }

    @Test
    public void hasName(){
        assertEquals("Yay Candy", candyStall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Fred", candyStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(1, candyStall.getParkingSpot());
    }

    @Test
    public void hasRating() { assertEquals(5, candyStall.getRating());}
}
