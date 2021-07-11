import java.time.LocalDateTime;

public class User {
    String name;

    String surname;

    LocalDateTime birthday;

    Address address;

    public User(String name, String surname, LocalDateTime birthday, Address address) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnameName() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(String city, String street, int app) {
        this.address.setCity(city);
        this.address.setStreet(street);
        this.address.setApp(app);
    }

    public String toString() {
        return name + " : " + surname + " : " + birthday.toString() + " : " + address.toString();
    }

}
