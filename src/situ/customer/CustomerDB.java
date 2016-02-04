package situ.customer;

public class CustomerDB {

    public static Customer getCustomer(String num) {
        Customer c = new Customer();

        if (num.equals("1001")) {
            c.setName("Barbara White");
            c.setAddress("3400 Richmond Parkway #3423");
            c.setCity("Bristol");
            c.setState("CT");
            c.setPostalCode("06010");
        } else if (num.equals("1002")) {
            c.setName("Karl Vang");
            c.setAddress("327 Franklin Street");
            c.setCity("Edina");
            c.setState("MN");
            c.setPostalCode("55435");
        } else if (num.equals("1003")) {
            c.setName("Ronda Chavan");
            c.setAddress("518 Commanche Dr.");
            c.setCity("Greensboro");
            c.setState("NC");
            c.setPostalCode("27410");
        } else {
            c.setName("Unknown");
        }
        return c;
    }

}
