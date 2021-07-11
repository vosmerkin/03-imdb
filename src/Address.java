public class Address {
    String city;
    String street;
    Integer app;

    public Address(String city, String street, int app){
        this.city = city;
        this.street = street;
        this.app = app;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
