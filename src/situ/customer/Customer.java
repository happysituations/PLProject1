package situ.customer;

public class Customer {
    private String name;
    private String address;
    private String city;
    private String state;
    private String postalCode;

    public Customer(){

    }

    public String getName(){
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public String getNameAndAddress() {
        return name + "\n" + address + "\n" + city + ", " + state + " " + postalCode;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }




}
