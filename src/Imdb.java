import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Imdb {
    public  List<User> db = new ArrayList<User>();

    public void addEntryManually(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Manual entry adding");
        System.out.println("Enter new user name:");
        String name = scanner.next();

        System.out.println("Enter new user surname:");
        String surname = scanner.next();

        System.out.println("Enter user birthdate");
        System.out.println("Year (1900...2021):");
        int year = scanner.nextInt();
        System.out.println("Month(1...12):");
        int month = scanner.nextInt();
        System.out.println("Day(1...31):");
        int day = scanner.nextInt();
        LocalDateTime dt = LocalDateTime.of(year, month, day, 0, 0);

        System.out.println("Enter user address");
        System.out.println("City:");
        String city = scanner.next();
        System.out.println("Street:");
        String street = scanner.next();
        scanner.close();
        System.out.println("App:");
        int app = scanner.nextInt();

        Imdb.addEntry();

    }

    public void addEntry(){

    }
}
