import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {

    Flight flight;
    @Before
    public void before(){
        flight = new Flight("Paris");
    }

    @Test
    public void flightStartsEmpty(){
        assertEquals(0, flight.getCustomerList().size());
    }

    @Test
    public void hasDestination(){
        assertEquals("Paris",flight.getDestination());
    }


}

