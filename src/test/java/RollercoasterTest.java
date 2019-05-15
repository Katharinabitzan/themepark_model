import attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Best rollercoaster", 4);
    }

    @Test
    public void hasName(){
        assertEquals("Best rollercoaster", rollercoaster.getName());
    }

    @Test
    public void hasRating() { assertEquals(4, rollercoaster.getRating());}
}
