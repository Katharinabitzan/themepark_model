import stalls.IceStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceStallTest {

    IceStall iceStall;

    @Before
    public void before(){
        iceStall = new IceStall("Yay Icecream", "Fred", 1, 5);
    }

    @Test
    public void hasName(){
        assertEquals("Yay Icecream", iceStall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Fred", iceStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(1, iceStall.getParkingSpot());
    }

    @Test
    public void hasRating() { assertEquals(5, iceStall.getRating());}
}
