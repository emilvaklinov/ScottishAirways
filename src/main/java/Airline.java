public class Airline {


    public void checkInCustomer(Customer customer, Flight flight) {
        flight.addCustomerToCustomerList(customer);
    }

    public void checkInLuggage(Luggage luggage, Flight flight) {
        flight.addLuggageToLuggageList(luggage);
    }
}
