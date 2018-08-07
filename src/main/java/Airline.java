import java.util.ArrayList;

public class Airline {

    private ArrayList<Ticket> tickets;

    public Airline() {
        this.tickets = new ArrayList<>();
    }

    public void checkInCustomer(Customer customer, Flight flight) {
        flight.addCustomerToCustomerList(customer);
        checkInLuggage(customer.getLuggage(), flight);
    }

    public void checkInLuggage(Luggage luggage, Flight flight) {
        flight.addLuggageToLuggageList(luggage);
    }

    public void transferCustomerToADifferentFlight(Customer customer, Flight flight){
        //find ticket of the customer
        Ticket ticketToChange = findTicket(customer);
        //change the flight on ticket to a new flight
        ticketToChange.setFlight(flight);
        //move customer from the AL of the prev flight to the new one
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void addTicket(Ticket ticket){
        this.tickets.add(ticket);
    }

    public Ticket findTicket(Customer customer){
        Ticket foundTicket = null;
        for (Ticket ticket: this.tickets) {
            if(ticket.getCustomer() == customer) {
                foundTicket = ticket;
            }
        }
        return foundTicket;
    }


}
