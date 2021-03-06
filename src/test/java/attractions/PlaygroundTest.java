package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor = new Visitor(12, 1.1, 23.00);
        visitor2 = new Visitor(20, 1.7, 53.00);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }
    @Test
    public void visitorIsAllowed(){
        assertEquals( true, playground.isAllowedTo(visitor));
    }
    @Test
    public void visitorIsNotAllowed(){
        assertEquals(false, playground.isAllowedTo(visitor2));
    }
}
