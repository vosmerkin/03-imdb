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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getApp() {
        return app;
    }

    public void setApp(Integer app) {
        this.app = app;
    }

    public String toString(){
        return city + ":" + street + ":" + app.toString();
    }
}
