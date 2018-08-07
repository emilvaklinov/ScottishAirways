public class Ticket {

    private Flight flight;
    private Customer customer;

    public Ticket(Flight flight, Customer customer){
        this.flight = flight;
        this.customer = customer;
    }

    public Flight getFlight() {
        return this.flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
