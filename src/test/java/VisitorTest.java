import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    Visitor youngVisitor;
    Visitor shortVisitor;
    Visitor brokeVisitor;

    @Before
    public void before(){
        visitor = new Visitor(25, 170, 200.0);
        youngVisitor = new Visitor(12, 150, 200.0);
        shortVisitor = new Visitor(20, 100, 200);
        brokeVisitor = new Visitor(20, 170, 10);
    }

    @Test
    public void hasAge(){
        assertEquals(25, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(170, visitor.getHeight());
    }

    @Test
    public void hasMoney(){
        assertEquals(200, visitor.getMoney(), 0.01);
    }
}
