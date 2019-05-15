import interfaces.IReviewed;
import stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Free Cancer", "Fred", 1, 1);
    }

    @Test
    public void hasName(){
        assertEquals("Free Cancer", tobaccoStall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Fred", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(1, tobaccoStall.getParkingSpot());
    }
}
