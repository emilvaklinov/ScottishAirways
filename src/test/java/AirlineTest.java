import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AirlineTest {

    Airline airline;
    Flight flight;
    Customer customer;

    @Before
    public void before(){
        airline = new Airline();
        customer = new Customer("Mike");
        flight = new Flight();

    }

    @Test
    public void canCheckIn(){
        airline.checkInCustomer(customer, flight);
        assertEquals(1, flight.getCustomers().size());
    }
}
