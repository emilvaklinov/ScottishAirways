import java.util.ArrayList;

public class Flight {

    private ArrayList<Customer> customerList;
    private ArrayList<Luggage> luggageList;
    private String destination;

    public Flight(String destination){
    this.customerList = new ArrayList<>();
    this.luggageList = new ArrayList<>();
    this.destination = destination;
    }

    public ArrayList<Customer> getCustomerList()
    {
        return this.customerList;
    }

    public ArrayList<Luggage> getLuggageList() {
        return luggageList;
    }

    public void addCustomerToCustomerList(Customer customer) {
        this.customerList.add(customer);
    }

    public void addLuggageToLuggageList(Luggage luggage) {
        this.luggageList.add(luggage);
    }

    public String getDestination(){
        return this.destination;
    }
}
