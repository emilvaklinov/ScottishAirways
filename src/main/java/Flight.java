import java.util.ArrayList;

public class Flight {

    private ArrayList<Customer> customerList;
    private ArrayList<Luggage> luggageList;

    public Flight(){
    customerList = new ArrayList<>();
    luggageList = new ArrayList<>();
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
}
