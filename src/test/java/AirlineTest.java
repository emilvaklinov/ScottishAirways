import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AirlineTest {


    Flight flight;
    Flight flight2;
    Customer customer;
    Luggage luggage;
    Ticket ticket;
    Airline airline;

    @Before
    public void before(){


        flight = new Flight("Paris");
        flight2 = new Flight("Barcelona");
        customer = new Customer("Mike");
        luggage = new Luggage(13.0, 3);
        ticket = new Ticket(flight, customer);
        airline = new Airline();
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

    @Test
    public void canAddTickets(){
        airline.addTicket(ticket);
        assertEquals(1, airline.getTickets().size());
    }

    @Test
    public void findTicketByCustomerName(){
        airline.addTicket(ticket);
        assertEquals(ticket, airline.findTicket(customer));
    }

    @Test
    public void canTransferTicketToADiffFlight(){
        airline.addTicket(ticket);
        assertEquals("Paris", ticket.getFlight().getDestination());
        airline.transferCustomerToADifferentFlight(customer, flight2);
        assertEquals("Barcelona", ticket.getFlight().getDestination());
    }
}
