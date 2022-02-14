package autoWiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class emp {
    //    @Autowired can be used at the top or above setter method or above constructor
    //    must use <context-annotation in xml file for using this annotation

    @Autowired

    //    if there are more than 2 bean with different name for passing then we use @Qualifier for selection a perticular bean name
    @Qualifier("tempaddress0")


    private Address address;

    public Address getAddress() {
        return address;
    }

//    @Autowired
    public void setAddress(Address address) {
        System.out.println("Setter called");
        this.address = address;
    }
//    @Autowired
    public emp(Address address) {
        System.out.println("Constructor called");
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
