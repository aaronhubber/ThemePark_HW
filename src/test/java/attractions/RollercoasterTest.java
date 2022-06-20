package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(12, 1.1, 23.00);
        visitor2 = new Visitor(20, 2.7, 53.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }
    @Test
    public void visitorIsNotAllowed(){
        assertEquals( false, rollerCoaster.isAllowedTo(visitor));
    }
    @Test
    public void visitorIsAllowed(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
    }
    @Test
    public void hasTicketPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.0);
    }

    @Test
    public void hasTicketPriceForTallPeople(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.0);
    }
}
