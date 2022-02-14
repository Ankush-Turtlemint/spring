package autoWiring;


public class emp {

    private Address address;

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        System.out.println("Setter called");
        this.address = address;
    }

    public emp(Address address) {
        this.address = address;
    }

    public emp() {
        super();
    }

    @Override
    public String toString() {
        return "emp{" +
                "address=" + address +
                '}';
    }
}
