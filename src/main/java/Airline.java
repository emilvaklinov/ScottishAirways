public class Airline {

    public void checkInCustomer(Customer customer, Flight flight){
        flight.getCustomers().add(customer);
    }
}
