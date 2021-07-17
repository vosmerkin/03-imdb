
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Imdb {
    public List<User> db = new ArrayList<User>();

    public void addEntry(User user) {
        db.add(user);
    }

    public void searchUsers(String searchString, LocalDate birthday) {
        //int[] searchResults = new int[0];
        for (User user : db) {
            if (searchString != "") {
                if ((user.name.contains(searchString))
                        | (user.surname.contains(searchString))
                        | (user.address.city.contains(searchString))
                        | (user.address.street.contains(searchString)) |
                        (user.address.app.toString().equals(searchString))) {
                    System.out.println(db.indexOf(user) + " " + user.toString());
                }
            } else {
                if (user.birthday.equals(birthday)) System.out.println(db.indexOf(user) + " " + user.toString());
            }
        }

        // return searchResults;
    }

    public void delete(int userIndex) {

        db.remove(userIndex);

    }
}
