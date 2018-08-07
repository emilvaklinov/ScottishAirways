import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicketTest {

    Ticket ticket;
    Flight flight;
    Customer customer;
    Flight flight2;

    @Before
    public void before(){

        flight = new Flight("New York");
        flight2 = new Flight("Innsbruck");
        customer = new Customer("Mike");
        ticket = new Ticket(flight, customer);
    }


    @Test
    public void hasFlight(){
        assertEquals(flight, ticket.getFlight());
    }
    @Test
    public void canChangeFlightOnTicket(){
        assertEquals("New York", ticket.getFlight().getDestination());
        ticket.setFlight(flight2);
        assertEquals("Innsbruck", ticket.getFlight().getDestination());
    }
}
