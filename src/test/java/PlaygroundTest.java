import attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor youngVisitor;
    Visitor oldVisitor;

    @Before
    public void before(){
        playground = new Playground("Best playground", 3);
        oldVisitor = new Visitor(25, 170, 200.0);
        youngVisitor = new Visitor(12, 150, 200.0);
    }

    @Test
    public void hasName(){
        assertEquals("Best playground", playground.getName());
    }

    @Test
    public void hasRating() { assertEquals(3, playground.getRating());}

    @Test
    public void canCheckIfTooOld() {
        assertEquals( false, oldVisitor.isAllowed());
    }
}
