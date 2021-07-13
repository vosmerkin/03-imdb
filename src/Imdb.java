import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Imdb {
    private static  List<User> db = new ArrayList<User>();

    public static void addEntry(User user) {
        db.add(user);
    }
}
