import java.time.LocalDate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class User {
    String name;

    String surname;

    LocalDate birthday;

    Address address;

    public User(String name, String surname, LocalDate birthday, Address address) {
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
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
        return name + ":" + surname + ":" + birthday.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + ":" + address.toString();

    }

    public void addEntry (String name, String surname, LocalDate birthday, String city, String street, Integer app){

    }

}
