public class Customer {
    private String name;
    private Luggage luggage;

    public Customer(String name, Luggage luggage) {
        this.name = name;
        this.luggage = luggage;
    }

    public String getName() {
        return name;
    }

    public Luggage getLuggage() {
        return luggage;
    }
}
