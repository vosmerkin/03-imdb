import java.time.LocalDateTime;
import java.util.Scanner;

public class Menu {

    public void start() {
        Integer menuItem;
        do {
            menuItem = this.mainMenu();

            switch (menuItem) {
                case (1):
                    this.addEntry();
                    break;
                case (2):

                    break;
                case (3):

                    break;
                case (9):

                    break;
            }

        }
        while (menuItem != 9);
    }

    public Integer mainMenu(){
        System.out.println("1 - Add entry");
        System.out.println("2 - Delete entry");
        System.out.println("3 - Edit entry");
        System.out.println("4 - Search by name");
        System.out.println("9 - Quit");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.close();
        return i;
    }

    public void addEntry(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adding new entry");
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
        LocalDateTime birthday = LocalDateTime.of(year, month, day, 0, 0);

        System.out.println("Enter user address");
        System.out.println("City:");
        String city = scanner.next();
        System.out.println("Street:");
        String street = scanner.next();
        scanner.close();
        System.out.println("App:");
        int app = scanner.nextInt();

        Imdb.addEntry(new User (name,surname,birthday, new Address(city,street,app) ));

    }

}
