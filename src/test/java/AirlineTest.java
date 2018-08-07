import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AirlineTest {

    Airline airline;
    Flight flight;
    Customer customer;
    Luggage luggage;

    @Before
    public void before(){
        airline = new Airline();
        customer = new Customer("Mike");
        flight = new Flight("Paris");
        luggage = new Luggage(13.0, 3);
    }

    @Test
    public void canCheckIn(){
        airline.checkInCustomer(customer, flight);
        assertEquals(1, flight.getCustomerList().size());
    }

    @Test
    public void canCheckInLuggage(){
        airline.checkInLuggage(luggage, flight);
        assertEquals(1, flight.getLuggageList().size());
    }
}
